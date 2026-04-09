package desafio4;

public class Push extends Notificacao{

    private String titulo;

    public Push(String destinatario, String titulo, String mensagem) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void enviar(){
        super.enviar();
        System.out.println("Título: "+titulo);
        System.out.println("Conteúdo: "+getMensagem()+"\n");
    }
}
