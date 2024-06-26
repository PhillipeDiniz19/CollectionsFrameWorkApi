package MapInterface.ordenacao;


import jdk.jfr.Event;

import java.time.Month;
import java.util.*;
import java.time.LocalDate;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos(){
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = eventoMap.keySet();
        Collection<Evento> values = eventoMap.values();
        eventoMap.get();*/
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();
        for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " +  proximoEvento + "acontecerá na data: " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 17), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MARCH, 15), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.APRIL, 15), "Evento 4", "Atração 4");
        agendaEventos.exibirAgenda();

    }


}
