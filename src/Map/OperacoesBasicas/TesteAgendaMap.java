package Map.OperacoesBasicas;

public class TesteAgendaMap {
    public static void main(String[] args) {
        AgendaContatos agendaContatos  = new AgendaContatos();

        agendaContatos.adicionarContato("Marcos", 65465654);
        agendaContatos.adicionarContato("Marcos", 654);
        agendaContatos.adicionarContato("Marcos", 9999);
        agendaContatos.adicionarContato("Pedro", 65465654);
        agendaContatos.adicionarContato("Maria", 65465654);
        agendaContatos.adicionarContato("Joao", 65465654);
        agendaContatos.adicionarContato("Aline", 65465654);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Marcos");

        agendaContatos.exibirContatos();

        System.out.println( agendaContatos.pesquisarPorNome("Maria"));
    }
}
