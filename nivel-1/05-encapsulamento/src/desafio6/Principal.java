package desafio6;

import desafio2.Contato;

/**
 * Você está desenvolvendo um sistema para um banco digital. Os clientes precisam confiar que suas transações serão
 * seguras e que o sistema nunca permitirá que eles gastem mais do que possuem em conta. Seu desafio é garantir essa
 * segurança nas operações financeiras de depositar e sacar.
 *
 * Crie uma classe que:
 *
 * Permita criar contas com titular e saldo inicial.
 * Realize depósitos com valores positivos.
 * Autorize saques apenas quando houver saldo suficiente.
 * Exiba o saldo atualizado após cada operação.
 */

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta("Isabella");
        conta.depositar(800);
        conta.depositar(200);
        conta.sacar(500);
        conta.sacar(900);
    }
}
