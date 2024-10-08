package principal;

public class Main {
    public static void main(String[] args) {
    	Estoque estoque = new Estoque();

        Produto produtoEletrico = new ProdutoEletrico(1, "Fusível", "Fusível de proteção", 0.05, 220);
        Produto produtoMecanico = new ProdutoMecanico(2, "Parafuso", "Parafuso de aço inox", 0.1, "Aço Inox", 100);

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(produtoEletrico, 10, 1.50, "UsuarioA");
        estoque.adicionarProduto(produtoMecanico, 20, 0.20, "UsuarioB");
        estoque.adicionarProduto(produtoEletrico, 15, 1.75, "UsuarioA");

        // Listando produtos
        estoque.listarProdutos();

        // Removendo um produto do estoque
        estoque.removerProduto(1, 5, 1.50, "UsuarioA");

        // Listando movimentações
        estoque.listarMovimentacoes();
        
     // Calculando custo médio
        estoque.calcularCustoMedio(1);
    }
}
