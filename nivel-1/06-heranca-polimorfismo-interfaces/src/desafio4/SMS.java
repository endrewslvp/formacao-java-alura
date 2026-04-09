package desafio4;

public class SMS extends Notificacao{
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar(){
        super.enviar();
        System.out.println("Mensagem: "+getMensagem()+"\n");
    }
}
