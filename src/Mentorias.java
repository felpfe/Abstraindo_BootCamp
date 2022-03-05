import java.time.LocalDate;

public class Mentorias extends Conteudo{
    private LocalDate Data;

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", Data=" + Data +
                '}';
    }

    @Override
    public double caculaxp() {
        return XP_PADRÃO + 20d;
    }
}
