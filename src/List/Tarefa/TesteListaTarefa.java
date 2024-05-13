package List.Tarefa;

public class TesteListaTarefa {

    public static void main(String[] args) {

          ListaTarefa listaTarefa = new ListaTarefa();

            System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

            listaTarefa.adicionarTarefa("Tarefa 1");
            listaTarefa.adicionarTarefa("Tarefa 1");
            listaTarefa.adicionarTarefa("Tarefa 2");
            listaTarefa.adicionarTarefa("Tarefa 3");
            listaTarefa.adicionarTarefa("Tarefa 4");
            listaTarefa.adicionarTarefa("Tarefa 5");

            System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
            listaTarefa.obterDescricoesTarefas();

             listaTarefa.removerTarefa("Tarefa 1");


        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }
}
