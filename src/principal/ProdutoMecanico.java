package principal;

class ProdutoMecanico extends Produto {
    private String material;
    private double capacidadeCarga;

    public ProdutoMecanico(Integer codigo, String nome, String descricao, double peso, String material, double capacidadeCarga) {
        super(codigo, nome, descricao, peso);
        this.material = material;
        this.capacidadeCarga = capacidadeCarga;
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    // Implementação do método abstrato
    @Override
    public String obterDetalhes() {
        return "Produto Mecânico [Código: " + getCodigo() + ", Nome: " + getNome() + 
               ", Descrição: " + getDescricao() + ", Peso: " + getPeso() + 
               "kg, Material: " + material + ", Capacidade de Carga: " + capacidadeCarga + "kg]";
    }
}
