package dio.abstraindo.poo.dominio;

public abstract class Conteudo {
    //static permite acessar o elemento fora da classe
    protected static final double XP_PADRAO = 10d; //constante (final)

    private String titulo;
    private String descricao;

    //metodo calcular xp
    public abstract double calcularXp(); //abstract nao pode ser instanciada

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
