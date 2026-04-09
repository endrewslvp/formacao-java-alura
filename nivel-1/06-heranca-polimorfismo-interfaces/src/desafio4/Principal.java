package desafio4;

/**
 * Você está desenvolvendo um sistema de comunicação para uma plataforma que precisa enviar alertas aos usuários de
 * diferentes formas. Cada tipo de notificação tem suas particularidades: um e-mail exige um assunto e um corpo, um SMS
 * somente o texto da mensagem, e uma notificação push deve conter um título e uma mensagem de texto.
 *
 * Crie um programa que:
 *
 * Defina uma classe base Notificacao com atributos destinatário e mensagem.
 * Crie classes específicas (Email, SMS, Push) que herdem de Notificacao.
 * Cada uma deve implementar o seu próprio metodo enviar(), exibindo como cada notificação é disparada. Lembre-se de
 * sobrescrever o metodo utilizando a anotação @override.
 */

public class Principal {
    public static void main(String[] args) {
        Email email = new Email("cliente@exemplo.com","Promoção especial!","Aproveite nossos descontos esta semana.");
        SMS sms = new SMS("(11) 91234-5678","Sua fatura foi paga com sucesso!");
        Push push = new Push("usuario","Novidade!","Você tem uma nova mensagem não lida.");

        email.enviar();
        sms.enviar();
        push.enviar();
    }
}
