package desafio5;

import java.util.Scanner;

/**
 * Laura está desenvolvendo um sistema de busca e precisa verificar se uma palavra específica está presente em um texto.
 * Crie um programa que receba um texto e uma palavra, e exiba uma mensagem indicando se a palavra está presente no
 * texto.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        if (texto.contains(palavra)){
            System.out.printf("A palavra \"%s\" está presente no texto.",palavra);
        }else {
            System.out.printf("A palavra \"%s\" não está presente no texto.",palavra);
        }
    }
}
