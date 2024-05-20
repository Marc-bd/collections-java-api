package Set.Pesquisa;

import java.util.*;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> novosContatos = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().startsWith(nome)) {
                novosContatos.add(c);
            }
        }
        return novosContatos;
    }

    public Contato atualizarNumeroContato(String nome, String numero) {
       Contato contatoAtualizado = null;
       for (Contato c : contatos) {
           if (c.getNome().equalsIgnoreCase(nome)) {
               c.setNumero(numero);
               contatoAtualizado = c;
               break;
           }
       }
       return contatoAtualizado;
    }
}
