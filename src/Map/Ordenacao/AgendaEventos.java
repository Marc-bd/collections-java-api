package Map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        this.eventos.put(data, new Evento( nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataHoje = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);

        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataHoje) || entry.getKey().isAfter(dataHoje)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                break;
            }
        }
        if(proximoEvento != null) {

        System.out.println("Proximo evento acontecerá na data: " + proximaData + " e será o : " + proximoEvento);
        } else {
            System.out.println("Não há próximos eventos");
        }
    }
}
