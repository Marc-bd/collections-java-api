package Set.OperacoesBasicas;

public class TesteSetConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 3);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 4);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 5);
        conjuntoConvidados.adicionarConvidado("Convidado 51", 5);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(4);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set");
        conjuntoConvidados.exibirConvidados();
    }
}
