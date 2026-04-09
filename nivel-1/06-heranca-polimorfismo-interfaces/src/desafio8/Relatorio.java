package desafio8;

public class Relatorio implements Imprimivel{

    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Título: "+titulo);
        System.out.println("Conteúdo: "+conteudo);
    }

}
