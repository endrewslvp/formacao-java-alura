package desafio1;

import java.util.List;

/**
 * Você está desenvolvendo um sistema para gerenciar os nomes dos funcionários de uma empresa de tecnologia. O sistema
 * precisa permitir que novos funcionários sejam adicionados a uma lista de nomes.
 *
 * Sua tarefa é criar uma lista de strings e adicionar os nomes dos funcionários "João", "Maria", " Vitor" e “Ana” a
 * essa lista. Depois, imprima a lista para verificar se os nomes foram adicionados corretamente.
 */

public class Principal {
    public static void main(String[] args) {
        List<String> listaFuncionarios = List.of("João","Maria","Vitor","Ana");
        System.out.println(listaFuncionarios);
    }
}
