package desafio3;

public class Ebook extends Midia{

    private String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo()+" | Ebook: "+getTitulo()+" - Formato: "+getFormato();
    }
}
