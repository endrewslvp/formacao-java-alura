package desafio4;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge1 {
    static void main() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(7);
        numeros.add(5);
        numeros.add(2);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}

