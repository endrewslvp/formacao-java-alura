package desafio5;

/**
 * Você está desenvolvendo o núcleo de processamento para uma fintech. A startup precisa de um sistema que possa
 * acomodar diferentes métodos de pagamento, cada um com suas particularidades de confirmação e regras de taxação. Seu
 * desafio é criar uma estrutura que unifique o essencial, mas permita comportamentos específicos para cada forma de
 * pagamento.
 *
 * Crie um programa que:
 *
 * Defina uma classe base Pagamento com o atributo valor.
 * Cada subclasse (CartaoCredito, BoletoBancario e Pix) implementa sua própria lógica de confirmação e cálculo de taxas.
 * Cartão: 3%.
 * Boleto: 1%
 * Pix: sem taxas
 * Exiba a mensagem de confirmação no console e mostre o valor da taxa.
 */

public class Principal {

    public static void main(String[] args) {

        Pagamento cartao = new Cartao(250.00);
        Pagamento boleto = new Boleto(500.00);
        Pagamento pix = new Pix(300.00);

        System.out.println(cartao.confirmarPagamento()+"\n");
        System.out.println(boleto.confirmarPagamento()+"\n");
        System.out.println(pix.confirmarPagamento()+"\n");

    }

}
