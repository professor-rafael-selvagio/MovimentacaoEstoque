package principal;

class ProdutoEletrico extends Produto {
    private int voltagem;

    public ProdutoEletrico(Integer codigo, String nome, String descricao, double peso, int voltagem) {
        super(codigo, nome, descricao, peso);
        this.voltagem = voltagem;
    }

    // Getter
    public int getVoltagem() {
        return voltagem;
    }

    // Implementação do método abstrato
    @Override
    public String obterDetalhes() {
        return "Produto Eletrico [Código: " + getCodigo() + ", Nome: " + getNome() + 
               ", Descrição: " + getDescricao() + ", Peso: " + getPeso() + 
               "kg, Voltagem: " + voltagem + "V]";
    }
}
