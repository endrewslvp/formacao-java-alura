package desafio2;

/**
 * Você está desenvolvendo um aplicativo de agenda para uma empresa. Os funcionários precisam acessar rapidamente os
 * contatos de clientes e fornecedores, mantendo as informações organizadas e fáceis de localizar.
 *
 * Crie uma classe que:
 *
 * Armazene contatos com nome e telefone em uma lista
 * Permita visualizar todos os contatos cadastrados
 * Formate a exibição para melhor legibilidade
 */

public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionar(new Contato("Isabella","(11) 98765-4321"));
        agenda.adicionar(new Contato("Endrew","(11) 91234-5678"));
        agenda.adicionar(new Contato("Matheus","(11) 98765-1234"));
        agenda.exibir();
    }
}
