package desafio3;

import java.awt.*;
import java.util.Scanner;

/**
 * Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
 * Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 */

public class Challenge1 {

    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();

            System.out.println("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            if (n2==0) throw new DivisaoPorZeroException("A divisão não pode ser por 0.");

            double div = n1/n2;
            System.out.println("Resultado da divisão: "+div);

        } catch (DivisaoPorZeroException e){
            System.out.println(e.getMessage());;
        }finally {
            System.out.println("A aplicação será finalizada.");
        }


    }
}

class DivisaoPorZeroException extends RuntimeException {

    private String message;

    public DivisaoPorZeroException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

/**
 * Solução do autor:
 */

//import java.util.Scanner;
//
//public class ExercicioDivisao {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Informe o numerador: ");
//        int numerador = scanner.nextInt();
//
//        System.out.println("Informe o denominador: ");
//        int denominador = scanner.nextInt();
//
//        try {
//            int resultado = numerador / denominador;
//            System.out.println("Resultado da divisão: " + resultado);
//        } catch (ArithmeticException e) {
//            System.out.println("Erro: Divisão por zero não permitida.");
//        }
//    }
//}