package desafio2;

/**
 * Imagine que você está criando um sistema de catalogação para uma biblioteca. Seu objetivo é desenvolver uma estrutura
 * que armazene dados de obras literárias e as exiba em um formato padronizado, facilitando a consulta por outros
 * leitores.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos título, autor e páginas.
 * Implemente um metodo que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.
 */

public class Principal {
    public static void main(String[] args) {
        Volume volume = new Volume("O Guia do Mochileiro das Galáxias","Douglas Adams",208);
        volume.getFormatedInfos();
    }
}
