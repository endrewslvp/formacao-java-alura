package desafio4;

import java.util.HashSet;
import java.util.Set;

/**
 * Você é uma pessoa desenvolvedora de software responsável por otimizar o sistema de gestão de eventos de uma empresa.
 * Recentemente, a organização relatou um problema: eventos duplicados estão aparecendo na lista de cadastros, o que
 * pode gerar inconsistências nos relatórios e dificultar processos administrativos.
 *
 * Sua tarefa é exibir a lista de eventos sem valores duplicados.
 */

public class Principal {
    public static void main(String[] args) {

        Set<String> listaEventos = new HashSet<>();

        listaEventos.add("IA Conference Brasil");
        listaEventos.add("AI Summit");
        listaEventos.add("DevFest");
        listaEventos.add("Cloud Expo");
        listaEventos.add("IA Conference Brasil");
        listaEventos.add("DevFest");

        System.out.println("Lista de eventos: "+listaEventos);
    }
}
