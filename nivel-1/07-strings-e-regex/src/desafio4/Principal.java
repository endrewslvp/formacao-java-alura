package desafio4;

import java.util.Scanner;

/**
 * Pedro está desenvolvendo um sistema de processamento de arquivos e precisa extrair o nome do arquivo sem a extensão.
 * Crie um programa que receba o nome de um arquivo e exiba o nome sem a extensão.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String arquivo = scanner.nextLine();

        if (arquivo.lastIndexOf(".")==-1){
            System.out.println("O arquivo não possui extensão.");
            return;
        }

        String nomeArquivo = arquivo.substring(0,arquivo.indexOf("."));

        System.out.println("Nome do arquivo sem a extensão: "+nomeArquivo);
    }
}
