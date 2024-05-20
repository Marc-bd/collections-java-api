package Set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{

    private String nome;
    private long cod;
    private int quantidade;
    private double preco;

    public Produto(String nome, int cod, int quantidade, double preco) {
        this.nome = nome;
        this.cod = cod;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", cod=" + cod + ", quantidade=" + quantidade + ", preco=" +
                preco + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Produto produto = (Produto) o;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(getCod());
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto prod1, Produto prod2) {
        return Double.compare(prod1.getPreco(), prod2.getPreco());
    }
}
