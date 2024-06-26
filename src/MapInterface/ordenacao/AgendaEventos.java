package MapInterface.ordenacao;


import jdk.jfr.Event;

import java.time.Month;
import java.util.*;
import java.time.LocalDate;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            System.out.println("Data: " + entry.getKey() + " - Evento: " + entry.getValue());
        }
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                return;
            }
        }
        System.out.println("Não há eventos futuros.");
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 17), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MARCH, 15), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 15), "Evento 4", "Atração 4");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}