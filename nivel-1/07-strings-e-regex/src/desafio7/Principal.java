package desafio7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pedro está desenvolvendo um sistema de controle de produtos e precisa verificar se os códigos de referência dos
 * produtos seguem o formato correto. O formato do código de referência é composto por:
 * 3 letras maiúsculas
 * Um hífen
 * 4 dígitos numéricos Crie um programa que receba um código de referência e informe se ele está no formato correto.
 */

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de referência: ");
        String texto = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(texto);

        if(matcher.find()){
            System.out.println("O código de referência está válido.");
        }else {
            System.out.println("O código de referência está inválido.");
        }

    }
}
