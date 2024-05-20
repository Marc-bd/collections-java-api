package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, int cod, int quantidade, double preco){
        this.produtos.add(new Produto(nome, cod, quantidade, preco));
    }

    public Set<Produto> exibirProdutosPorNome(){
        //Necessário fazer com Three set pois o set normal não aceita ordenação.
        Set<Produto> produtosOrganizadosPorNome = new TreeSet<>(this.produtos);
        return produtosOrganizadosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

}
