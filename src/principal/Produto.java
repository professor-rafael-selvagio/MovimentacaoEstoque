package principal;

abstract class Produto {
    private Integer codigo;
    private String nome;
    private String descricao;
    private double peso;

    public Produto(Integer codigo, String nome, String descricao, double peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.peso = peso;
    }

    // Getters
    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    // Método abstrato
    public abstract String obterDetalhes();
}
