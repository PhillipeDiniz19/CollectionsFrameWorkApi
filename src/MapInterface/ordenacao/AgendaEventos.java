package MapInterface.ordenacao;


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
    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();
    }


}
