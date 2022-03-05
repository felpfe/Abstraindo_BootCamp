public abstract class Conteudo {
    protected static final double XP_PADRÃO = 10d;

    private String Titulo;
    private String Descricao;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public abstract  double caculaxp();

}
