package desafio3;

public class Livro extends Midia{

    private String autor;

    public Livro (String titulo, int anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo()+" | Livro: "+getTitulo()+" - Autor: "+getAutor();
    }
}
