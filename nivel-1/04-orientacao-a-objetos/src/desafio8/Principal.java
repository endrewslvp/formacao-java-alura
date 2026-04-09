package desafio8;

/**
 * Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa garantir que o estoque seja
 * atualizado corretamente a cada venda realizada. Seu programa deve processar as vendas e alertar quando não houver
 * produtos suficientes no estoque.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos nome e quantidade.
 * Implemente um metodo que:
 * Subtraia a quantidade vendida do estoque se houver disponibilidade.
 * Exiba uma mensagem formatada com o saldo atual usando printf
 * Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.
 */

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta",100);
        produto.vender(25);
        produto.vender(50);
        produto.vender(30);
    }
}
