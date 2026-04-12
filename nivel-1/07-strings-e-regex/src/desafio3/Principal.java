package desafio3;

import java.util.Scanner;

/**
 *Ana está desenvolvendo um sistema de edição de textos e precisa substituir uma palavra específica por outra em um
 * texto. Crie um programa que:
 *
 * Receba um texto, uma palavra a ser substituída e uma nova palavra, exiba o texto com as substituições realizadas.
 * Se a palavra a ser substituída não for encontrada no texto, o programa deve informar ao usuário que a palavra não
 * foi encontrada e encerrar a execução.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra a ser substituída: ");
        String palavraSubstituida = scanner.nextLine();
        if (!texto.contains(palavraSubstituida)){
            System.out.println("A palavra não foi encontrada.");
            return;
        }

        System.out.print("Digite a nova palavra: ");
        String palavraNova = scanner.nextLine();

        String textoModificado = texto.replace(palavraSubstituida,palavraNova);

        System.out.println("Texto modificado: "+textoModificado);
    }
}
