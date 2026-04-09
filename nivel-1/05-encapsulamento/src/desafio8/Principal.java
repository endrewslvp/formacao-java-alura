package desafio8;

import java.util.Scanner;

/**
 * Imagine que você está desenvolvendo um sistema de acesso para um laboratório de informática da escola. Os estudantes
 * precisam autenticar-se com suas credenciais pessoais, mas o sistema deve proteger contra tentativas de adivinhação de
 * senhas.
 *
 * Crie uma classe que:
 *
 * Armazene o login e a senha de forma encapsulada.
 * Um metodo validarSenha() que receba as credenciais digitadas e retorne se o login foi bem-sucedido.
 * Uma lógica no arquivo principal que utilize a classe Scanner para ler o login e senha digitados, controlando as
 * tentativas com um loop.
 * Bloqueie o acesso após 3 falhas consecutivas.
 * Exiba mensagens informando o resultado da tentativa e quantas restam.
 */

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("endrew.estudos.com","12345");
        int tentativas = 1;
        while (tentativas<=3) {
            System.out.println("Digite a senha:");
            if (aluno.validarSenha(new Scanner(System.in).next())) {
                System.out.println("Login realizado!");
                break;
            } else {
                System.out.println("Senha incorreta!");
                System.out.println("Você possui mais " + (3 - tentativas) + " tentativas.\n");
                tentativas++;
            }
        }
        if (tentativas>3){
            System.out.println("Você expirou todas as tentativas. Tente novamente mais tarde.");
        }
    }
}
