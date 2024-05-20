package Set.Pesquisa;

public class TestePesquisaContatos {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.exibirContatos();

        agenda.adicionarContato("Marcos", "1236");
        agenda.adicionarContato("Marcos", "1236");
        agenda.adicionarContato("Marcos Paulo", "1125");
        agenda.adicionarContato("Marcos Pedro", "1896");
        agenda.adicionarContato("Julia Silva", "12566");
        agenda.adicionarContato("Pedro Martins", "13256");
        agenda.adicionarContato("Adalverto Dias", "14526");

        agenda.exibirContatos();

        System.out.println("Pesquisa por nome: " + agenda.pesquisarPorNome("Marcos"));

        System.out.println("Alterado numero do contato: " + agenda.atualizarNumeroContato("Adalverto Dias", "9999"));

        agenda.exibirContatos();
    }
}
