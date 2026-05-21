package desafio3;

import java.util.ArrayList;
import java.util.List;

/**
 * Você faz parte da equipe de tecnologia de uma empresa que precisa garantir que o cadastro de funcionários esteja
 * sempre atualizado. Hoje, você recebeu uma solicitação para manter o controle de acesso à empresa. Para isso, seu
 * código deve ser capaz de:
 *
 * Verificar quantos funcionários estão registrados
 * Descobrir o nome do segundo funcionário da lista
 */

public class Principal {
    public static void main(String[] args) {
        List<String> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add("João");
        listaFuncionarios.add("Maria");
        listaFuncionarios.add("Ana");
        listaFuncionarios.add("Pedro");
        listaFuncionarios.add("Antônio");

        System.out.printf("A segunda pessoa da lista é %s\n",listaFuncionarios.get(1));
        System.out.printf("Total de funcionários: %d\n",listaFuncionarios.size());
    }
}
