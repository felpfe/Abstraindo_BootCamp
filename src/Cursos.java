public class Cursos extends Conteudo{

    private int CargaHoraria;

    public Cursos() {
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }

    @Override
    public double caculaxp() {
        return XP_PADRÃO * CargaHoraria;
    }
}
