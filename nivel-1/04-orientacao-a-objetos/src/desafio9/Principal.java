package desafio9;

/**
 * Imagine que você está desenvolvendo um sistema de controle de devoluções para uma livraria. Quando um livro é
 * devolvido com atraso, é necessário calcular o valor da multa conforme os dias de atraso.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos título e dias de atraso.
 * Implemente um metodo que:
 * Cobre R$ 2,50 por dia de atraso.
 * Retorne o valor total da multa.
 * Implemente um metodo que mostre o título e o valor da multa formatado.
 */

public class Principal {
    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setTitulo("Dom Casmurro");
        emprestimo.setDiasAtraso(3);
        System.out.printf("Livro: %s | Multa por %d dia(s) de atraso: R$%.2f",
                emprestimo.getTitulo(),emprestimo.getDiasAtraso(),emprestimo.calcularAtraso());
    }
}
