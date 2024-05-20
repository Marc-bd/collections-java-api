package Set.Ordenacao;

public class TesteProdutosSet {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
//String nome, int cod, int quantidade, double preco
        cadastroProdutos.adicionarProduto("Produto 1", 1323215, 10, 25.30 );
        cadastroProdutos.adicionarProduto("Produto 2", 1953222, 10, 15.99 );
        cadastroProdutos.adicionarProduto("Produto 3", 156332, 10, 2.25 );
        cadastroProdutos.adicionarProduto("Produto 4", 1203210, 10, 33.89 );
        cadastroProdutos.adicionarProduto("Produto 5", 189652, 10, 99.00 );
        cadastroProdutos.adicionarProduto("Produto 6", 1654321, 10, 10.00 );

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
