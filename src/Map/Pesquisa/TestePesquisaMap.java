package Map.Pesquisa;

public class TestePesquisaMap {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 5.0,5);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 7.45,3);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 24.99,2);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 15.23,4);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total Estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

    }
}
