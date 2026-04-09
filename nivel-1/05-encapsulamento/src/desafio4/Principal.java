package desafio4;

/**
 * Você está desenvolvendo um sistema de autenticação para um aplicativo bancário. Os usuários precisam ter total
 * segurança de que suas senhas não podem ser alteradas sem autorização, mesmo que alguém tenha acesso temporário
 * ao dispositivo.
 *
 * Crie uma classe que:
 *
 * Armazene com segurança a senha do usuário
 * Permita alterar a senha apenas com a confirmação da senha atual
 * Forneça feedback sobre o resultado da operação
 */

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("12345");
        usuario.setPassword("12345","98745");
    }
}
