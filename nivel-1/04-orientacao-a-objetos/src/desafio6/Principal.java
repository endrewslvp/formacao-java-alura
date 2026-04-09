package desafio6;

/**
 * Você está desenvolvendo um sistema de controle de colaboradores para uma empresa de tecnologia. Às vezes, é
 * necessário atualizar o cargo e o nível de acesso de um funcionário devido a promoções ou mudanças de departamento.
 * Seu programa deve permitir essas alterações e mostrar as informações atualizadas.
 *
 * Crie uma classe que:
 *
 * Represente um colaborador com os atributos nome, cargo e nivel de acesso.
 * Implemente um metodo que permita alterar o cargo e o nível de acesso.
 * Exiba no console as informações antes e depois da atualização.
 */

public class Principal {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador("Endrew","Administrador Junior",1);
        colaborador.atualizarDados("Administrador Pleno",2);
    }
}
