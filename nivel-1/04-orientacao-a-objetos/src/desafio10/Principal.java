package desafio10;

/**
 * Você está desenvolvendo o sistema de checkout de um e-commerce de produtos eletrônicos. Seu desafio é calcular o
 * valor total do carrinho de compras, considerando que cada produto pode ter quantidades diferentes e preços variados.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos nome, preço e quantidade.
 * Implemente um metodo que retorne o valor total do item (preço x quantidade).
 * Crie uma lista de item e calcule o valor total da compra.
 */

public class Principal {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Produto("Camiseta",60,2));
        carrinho.adicionar(new Produto("Meia",25,10));
        System.out.printf("Total da compra: R$%.2f",carrinho.calcularTotal());
    }
}
