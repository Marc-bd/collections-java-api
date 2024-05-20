package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class TesteOrdenacaoMap {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 15), "Evento Agosto 15", "Atração Agosto 15" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 11), "Evento Agosto 11", "Atração Agosto 11" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 22), "Evento Julho 22", "Atração Julho 22" );


        //agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
