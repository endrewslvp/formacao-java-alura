package desafio2;

import com.google.gson.Gson;

/**
 * Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a
 * editora. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um
 * JSON aninhado representando um livro em um objeto do tipo Livro.
 */

public class Challenge3 {
    public static void main(String[] args) {

        String json = """
                    {
                        "titulo" : "Aventuras do Java",
                        "autor" : "Akemi",
                        "editora" : 
                            {
                                "nome": "TechBooks",
                                "cidade" : "São Paulo"
                            }
                    }
                """;

        Gson gson = new Gson();
        LivroDTO livroDTO = gson.fromJson(json, LivroDTO.class);
        Livro livro = new Livro(livroDTO);

        System.out.println(livro);
    }
}

class Livro{

    private String titulo;
    private String autor;
    private Editora editora;

    public Livro() {
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro (LivroDTO livroDTO){
        this.titulo = livroDTO.titulo();
        this.autor = livroDTO.autor();
        this.editora = new Editora(livroDTO.editora());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro: "+getTitulo()+
                "\nAutor: "+getAutor()+
                "\nEditora: "+editora.getNome()+" ("+editora.getCidade()+")";
    }
}

record LivroDTO (String titulo, String autor, EditoraDTO editora){ }

class Editora{
    private String nome;
    private String cidade;

    public Editora() {
    }

    public Editora(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Editora (EditoraDTO editoraDTO){
        this.nome = editoraDTO.nome();
        this.cidade = editoraDTO.cidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

record EditoraDTO (String nome, String cidade){}


