package desafio7;

import java.util.ArrayList;

/**
 * Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar usuários a organizar suas
 * atividades diárias. Cada tarefa precisa ser registrada com uma descrição e um status que indique se já foi concluída
 * ou não. Seu objetivo é criar uma estrutura que armazene essas tarefas e permita visualizá-las.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos descrição e concluída.
 * Implemente um metodo que mostre a descrição da tarefa e seu status.
 * Crie uma lista de tarefas e exiba todas as tarefas cadastradas. Dica: use ArrayList.
 */

public class Principal {
    public static void main(String[] args) {
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        listaTarefas.add(new Tarefa("Estudar Java",false));
        listaTarefas.add(new Tarefa("Fazer exercícios",true));
        for (Tarefa tarefa: listaTarefas){
            System.out.println("Tarefa "+(listaTarefas.indexOf(tarefa)+1)+"\n"+tarefa.toString());
        }
    }
}
