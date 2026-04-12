package desafio1;

import java.util.Scanner;

/**
 * Joana está desenvolvendo um sistema de cadastro de usuários e percebeu que muitos nomes estão sendo cadastrados com
 * espaços em branco no início ou no final. Ela quer um programa que remova esses espaços automaticamente.
 *
 * Crie um programa que receba um nome e exiba o nome sem espaços em branco no início ou no final.
 */

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        String nomeFormatado = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormatado);
    }

}
