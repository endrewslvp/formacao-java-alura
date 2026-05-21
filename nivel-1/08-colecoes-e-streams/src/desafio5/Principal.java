package desafio5;

import java.util.HashMap;
import java.util.Map;

/**
 * Você foi encarregado de desenvolver um sistema para gerenciar os clientes de uma livraria. Para garantir um controle
 * preciso dos registros, cada cliente deve possuir um ID único associado ao seu nome.
 *
 * Para resolver essa tarefa você deve:
 *
 * Armazenar os clientes através de uma chave e valor: (id, nome)
 * Cadastrar três clientes
 * Recuperar o nome do cliente de ID igual a 2
 */

public class Principal {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Maria");
        usuarios.put(2, "Marcos");
        usuarios.put(3, "Ana");

        System.out.println("O nome do cliente com ID 2 é: "+usuarios.get(2));
    }
}
