package desafio6;

public class Notificacao {

    public void enviarMensagem (String mensagem){
        System.out.printf("Mensagem enviada a todos: %s\n",mensagem);
    }

    public void enviarMensagem (String destinatario,String mensagem){
        System.out.printf("Mensagem para %s: %s\n",destinatario,mensagem);
    }

    public void enviarMensagem (String destinatario,String mensagem, int quantidade){
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Mensagem para %s: %s\n",destinatario,mensagem);
        }
    }
}
