package desafio7;

/**
 * Você está desenvolvendo um sistema para uma plataforma de streaming que deseja oferecer recomendações mais precisas
 * aos usuários. Para isso, é importante coletar avaliações confiáveis e calcular médias que reflitam a qualidade real
 * dos filmes.
 *
 * Crie uma classe que:
 *
 * Armazene o título do filme e suas avaliações. As avaliações são armazenadas em uma lista
 * Permita adicionar novas avaliações (apenas entre 1 e 5)
 * Calcule e exiba a média das avaliações com precisão decimal
 */

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme("Jogos Vorazes");
        filme.avaliar(4);
        filme.avaliar(3);
        System.out.printf("Média de avaliações para %s: %.1f estrelas",filme.getTitulo(),filme.getMediaAvalicoes());
    }
}
