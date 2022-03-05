import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
   private String Nome;
   private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
   private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public Dev() {

    }

    void Increver(BootCamp bootcamp) {
        this.conteudosIncritos.addAll((bootcamp.getConteudos()));
        bootcamp.getDevsIncritos().add(this);
    }

    void Progredir(){
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteudo");
        }
    }

    public double CalcularTotalXP(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::caculaxp)
                .sum();
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(Nome, dev.Nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, conteudosIncritos, conteudosConcluidos);
    }

    @Override
 public String toString() {
  return "Dev{" +
          "Nome='" + Nome + '\'' +
          '}';
 }
}
