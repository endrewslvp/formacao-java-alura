package desafio4;

public class Email extends Notificacao{

    private String assunto;

    public Email(String destinatario, String assunto, String mensagem) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void enviar(){
        super.enviar();
        System.out.println("Assunto: "+assunto);
        System.out.println("Corpo: "+getMensagem()+"\n");
    }
}
