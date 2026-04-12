package desafio9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Patrícia está desenvolvendo um sistema de análise de redes sociais e precisa extrair todas as hashtags de um texto.
 * Ela quer um programa que encontre todas as palavras que começam com "#".
 * Crie um programa que receba um texto e exiba todas as hashtags encontradas.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>();

        while (matcher.find()) {
            hashtags.add(matcher.group());
        }

        if (hashtags.isEmpty()) {
            System.out.println("Nenhuma hashtag encontrada.");
        } else {
            System.out.println("Hashtags encontradas: " + String.join(", ", hashtags));
        }
    }
}
