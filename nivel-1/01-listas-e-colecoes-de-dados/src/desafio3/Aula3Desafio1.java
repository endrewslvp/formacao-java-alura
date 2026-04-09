package desafio3;

import java.util.ArrayList;

public class Aula3Desafio1 {

    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Endrew");
        lista.add("Isabella");
        lista.add("Matheus");
        lista.forEach(System.out::println);
    }
}
