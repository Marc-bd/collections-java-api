package List.CarrinhoCompras;

public class TesteCarrinhoCompras {

    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();
        System.out.println("Quantidade de itens no carrinho: ");
        carrinho.exibirItens();

        carrinho.adicionarItem("Item 1", 10.00, 3);
        carrinho.adicionarItem("Item 1", 10.00, 3);
        carrinho.adicionarItem("Item 2", 10.00, 3);
        carrinho.adicionarItem("Item 3", 10.00, 3);
        carrinho.adicionarItem("Item 4", 10.00, 3);
        carrinho.adicionarItem("Item 5", 10.00, 3);

        System.out.println("Quantidade de itens no carrinho: ");
        carrinho.exibirItens();


        System.out.println("Quantidade de itens no carrinho, após a remoção do item 1: ");
        carrinho.removerItem("Item 1");
        carrinho.exibirItens();

        System.out.println("Valor total dos itens no carrinho: " + carrinho.calcularValorTotal());




    }
}
