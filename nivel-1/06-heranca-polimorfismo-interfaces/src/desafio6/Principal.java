package desafio6;

/**
 * Você está desenvolvendo um sistema de comunicação para uma plataforma de colaboração em equipe. Esse sistema precisa
 * lidar com diferentes cenários de envio de mensagens.
 *
 * Crie um programa que utilize sobrecarga de métodos para implementar as seguintes variações:
 *
 * Enviar uma mensagem padrão para todos os contatos, como Olá!.
 * Enviar uma mensagem personalizada para um contato específico, como Bom dia para João.
 * Reforçar uma mensagem enviando-a mais de uma vez para o mesmo contato, como: "Atenção!" para Maria, enviada duas
 * vezes.
 */

public class Principal {

    public static void main(String[] args) {

        Notificacao notificacao = new Notificacao();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);

    }
}
