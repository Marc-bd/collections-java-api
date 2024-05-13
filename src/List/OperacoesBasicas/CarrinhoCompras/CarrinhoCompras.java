package List.OperacoesBasicas.CarrinhoCompras;

import java.util.*;


public class CarrinhoCompras {

    List<Item> listaItem;

    public CarrinhoCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {

        List<Item> listaParaRemover = new ArrayList<>();

        for (Item item: listaItem) {
            if(item.getNome().equalsIgnoreCase(nome)) {
                listaParaRemover.add(item);
            }
        }

        listaItem.removeAll(listaParaRemover);
    }

    public Double calcularValorTotal(){
        double total = 0.0;
        for (Item item: listaItem) {
            double valorItem = item.getPreco() * item.getQuantidade();
            total += valorItem;
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(listaItem);
    }
}
