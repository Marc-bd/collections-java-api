package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto produto : estoqueProdutos.values()) {
                total += produto.getQuantidade() * produto.getPreco();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtomMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto produto : estoqueProdutos.values()) {
                if (produto.getPreco() > maiorPreco) {
                    maiorPreco = produto.getPreco();
                    produtomMaisCaro = produto;
                }
            }
        }
        return produtomMaisCaro;
    }


}
