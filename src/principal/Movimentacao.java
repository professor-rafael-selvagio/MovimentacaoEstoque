package principal;

import java.time.LocalDateTime;

class Movimentacao {
    private LocalDateTime data;
    private int quantidade;
    private double valorUnitario;
    private String usuario;
    private Produto produto; // Referência ao produto
    private TipoMovimentacao tipo; // Tipo da movimentação (entrada ou saída)

    public Movimentacao(Produto produto, int quantidade, double valorUnitario, String usuario, TipoMovimentacao tipo) {
        this.data = LocalDateTime.now(); // Data atual
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.usuario = usuario;
        this.produto = produto; // Associando o produto à movimentação
        this.tipo = tipo; // Definindo o tipo de movimentação
    }

    public LocalDateTime getData() {
        return data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public String getUsuario() {
        return usuario;
    }

    public Produto getProduto() {
        return produto; // Método para acessar o produto
    }

    public TipoMovimentacao getTipo() {
        return tipo; // Método para acessar o tipo da movimentação
    }

    @Override
    public String toString() {
        return "Movimentação [Produto: " + produto.getNome() + ", Tipo: " + tipo + 
               ", Data: " + data + ", Quantidade: " + quantidade + 
               ", Valor Unitário: R$" + valorUnitario + ", Usuário: " + usuario + "]";
    }
}