package desafio2;

import java.util.Scanner;

/**
 * Carlos está desenvolvendo um sistema de relatórios e precisa padronizar o texto para que todos os títulos estejam em
 * maiúsculas e as descrições em minúsculas. Faça um programa que receba um texto e exiba o texto em maiúsculas e o
 * texto em minúsculas.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();
        String textoMinusculo = texto.toLowerCase();
        String textoMaiusculo = texto.toUpperCase();
        System.out.println("Texto em maiúsculas: "+textoMaiusculo);
        System.out.println("Texto em minúsculas: "+textoMinusculo);
    }
}
