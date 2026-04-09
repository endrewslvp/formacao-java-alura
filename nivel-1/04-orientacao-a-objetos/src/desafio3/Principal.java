package desafio3;

/**
 * Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar transações
 * financeiras. Em determinadas situações, como encerramento de conta, é necessário zerar o saldo disponível.
 *
 * Crie um programa que:
 *
 * Defina uma classe com o atributo saldo.
 * Implemente um metodo que redefine o valor do saldo para 0.0.
 * Implemente um metodo que mostra o saldo atual formatado.
 */

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta(1579.42);
        System.out.printf("Saldo: R$%.2f\n",conta.getSaldo());
        conta.zerarSaldo();
        System.out.printf("Saldo: R$%.2f",conta.getSaldo());
    }
}
