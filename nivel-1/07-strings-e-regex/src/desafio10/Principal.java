package desafio10;

import java.util.Scanner;

/**
 * Carla está desenvolvendo um sistema de cadastro de usuários e precisa validar as senhas. A senha deve ter pelo menos:
 * 8 caracteres
 * Uma letra maiúscula
 * Uma letra minúscula
 * Um número
 * Um caractere especial
 * Crie um programa que receba uma senha e exiba uma mensagem indicando se a senha é válida ou não.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        String regex = "^(?=.*[A-Z])" +
                "(?=.*[a-z])" +
                "(?=.*\\d)" +
                "(?=.*[@$!%*?&])" +
                "[A-Za-z\\d@$!%*?&]{8,}$";

        if (senha.matches(regex)) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha não é válida.");
        }
    }
}
