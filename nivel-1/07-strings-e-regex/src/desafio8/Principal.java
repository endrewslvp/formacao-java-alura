package desafio8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Roberto está desenvolvendo um sistema de cadastro de clientes e precisa validar os números de CPF fornecidos. Ele
 * quer um programa que verifique se o CPF está no formato correto (XXX.XXX.XXX-XX).
 * Crie um programa que receba um CPF e exiba uma mensagem indicando se o CPF está no formato válido.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        Pattern pattern = Pattern.compile("(\\d{3}).(\\d{3}).(\\d{3})-(\\d{2})");
        Matcher matcher = pattern.matcher(cpf);

        if (!matcher.find()){
            System.out.printf("O CPF %s é inválido.",cpf);
        }else {
            System.out.printf("O CPF %s é válido.",cpf);
        }
    }
}
