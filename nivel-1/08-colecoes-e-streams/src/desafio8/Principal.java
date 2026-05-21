package desafio8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Você está desenvolvendo uma aplicação matemática que precisa calcular o quadrado de uma lista de números. Essa
 * funcionalidade será usada para gerar gráficos e análises estatísticas. Para resolver essa tarefa você deve:
 *
 * Criar uma lista contendo os números fornecidos.
 * Calcular o quadrado de cada número utilizando o método map.
 * Criar uma nova lista contendo os resultados.
 * Exibir a lista de quadrados no console.
 */

public class Principal {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> numerosAoQuadrado = numeros.stream()
                .map(n -> n*n)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("Quadrados dos números: "+numerosAoQuadrado);
    }
}
