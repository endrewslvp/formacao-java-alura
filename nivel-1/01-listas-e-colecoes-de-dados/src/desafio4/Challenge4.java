package desafio4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Challenge4 {

    static void main() {
        List<String> listaArray = new ArrayList<>();
        List<String> listaLinked = new LinkedList<>();

        listaArray.add("Marcos");
        listaArray.add("Pedro");
        listaLinked.add("Marcos");
        listaLinked.add("Pedro");

        System.out.println("Lista por Array:");
        System.out.println(listaArray);
        System.out.println("\nLista por Linked:");
        System.out.println(listaLinked);
    }
}
