package desafio3;

/**
 * Imagine que você está desenvolvendo um sistema para uma biblioteca que precisa catalogar diferentes tipos de mídias:
 * livros, revistas e e-books. Cada mídia possui informações específicas, como título e ano de publicação, mas algumas
 * têm características únicas, como autor (livros), edição (revistas) ou formato (e-books). Seu programa deve ser capaz
 * de exibir esses dados para facilitar a consulta pelos bibliotecários.
 *
 * Crie um programa que:
 *
 * Defina uma classe Midia com os atributos título e ano de publicação.
 * Defina um metodo que gere um código no formato “LIB- + os três primeiros caracteres do título + ano de publicação”,
 * por exemplo:
 * Código: LIB-O H1937 | Livro: "O Hobbit" - Autor: J.R.R. Tolkien
 * Crie as classes Livro, Revista e Ebook, todas herdando de Midia, adicionando:
 * Livro: atributo autor.
 * Revista: atributo edição.
 * Ebook: atributo formato.
 * Cadastre uma mídia de cada tipo.
 * Exiba o código e os detalhes de cada mídia usando o metodo exibirInfo.
 */

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Biblia",1500,"Incontáveis");
        Revista revista = new Revista("Veja",2025,203);
        Ebook ebook = new Ebook("Harry Potter",2000,"pdf");

        System.out.println(livro.exibirInfo());
        System.out.println(revista.exibirInfo());
        System.out.println(ebook.exibirInfo());
    }
}
