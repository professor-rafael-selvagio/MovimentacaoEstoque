package principal;

import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> produtos;
    private List<Movimentacao> movimentacoes;

    public Estoque() {
        produtos = new ArrayList<>();
        movimentacoes = new ArrayList<>();
    }

    // Método para adicionar um produto ao estoque
    public void adicionarProduto(Produto produto, int quantidade, double valorUnitario, String usuario) {
        produtos.add(produto);
        movimentacoes.add(new Movimentacao(produto, quantidade, valorUnitario, usuario, TipoMovimentacao.ENTRADA));
        System.out.println("Produto adicionado ao estoque: " + produto.obterDetalhes());
        System.out.println("Movimentação registrada: " + movimentacoes.get(movimentacoes.size() - 1));
    }

    // Método para remover um produto do estoque pelo código
    public void removerProduto(Integer codigo, int quantidade, double valorUnitario, String usuario) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produtos.remove(produto);
                movimentacoes.add(new Movimentacao(produto, quantidade, valorUnitario, usuario, TipoMovimentacao.SAIDA));
                System.out.println("Produto removido do estoque: " + produto.obterDetalhes());
                System.out.println("Movimentação registrada: " + movimentacoes.get(movimentacoes.size() - 1));
                return;
            }
        }
        System.out.println("Produto com código " + codigo + " não encontrado no estoque.");
    }

    // Método para listar todos os produtos no estoque
    public void listarProdutos() {
        System.out.println("Produtos no estoque:");
        for (Produto produto : produtos) {
            System.out.println(produto.obterDetalhes());
        }
    }

    // Método para listar todas as movimentações
    public void listarMovimentacoes() {
        System.out.println("Movimentações registradas:");
        for (Movimentacao movimentacao : movimentacoes) {
            System.out.println(movimentacao);
        }
    }
    
    // Método para calcular o custo médio de um produto
    public void calcularCustoMedio(Integer codigo) {
        double totalValor = 0;
        int totalQuantidade = 0;
        
        for (Movimentacao mov : movimentacoes) {
            if (mov.getProduto().getCodigo().equals(codigo)) {
                totalValor += mov.getValorUnitario() * mov.getQuantidade();
                totalQuantidade += mov.getQuantidade();
            }
        }

        if (totalQuantidade > 0) {
            double custoMedio = totalValor / totalQuantidade;
            System.out.println("Custo médio do produto " + codigo + ": R$" + custoMedio);
        } else {
            System.out.println("Produto com código " + codigo + " não encontrado para cálculo do custo médio.");
        }
    }
}