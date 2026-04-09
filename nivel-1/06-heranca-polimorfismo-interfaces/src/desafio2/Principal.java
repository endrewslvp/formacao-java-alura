package desafio2;

import javax.print.Doc;

/**
 * Você está desenvolvendo um sistema de gestão para uma escola, onde é necessário organizar informações de alunos e
 * docentes. Cada pessoa na escola possui dados básicos, como nome e idade. No entanto, cada grupo também possui
 * características próprias: os alunos possuem uma nota final e os docentes são responsáveis por uma disciplina.
 *
 * Crie um programa que:
 *
 * Defina uma classe Pessoa com os atributos nome e idade.
 * Crie as classes Aluno e Docente, ambas herdando de Pessoa, adicionando:
 * Para Aluno: um atributo nota.
 * Para Docente: um atributo disciplina.
 * Instancie dois objetos Aluno e dois objetos Docente
 * Exiba as informações no terminal.
 */

public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Endrew",20);
        aluno1.setNota(9);
        Aluno aluno2 = new Aluno("João",21);
        aluno2.setNota(6);

        Docente docente1 = new Docente("Francildo",50,"Matemática");
        Docente docente2 = new Docente("Eudis",40,"Língua Portuguesa");

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(docente1);
        System.out.println(docente2);
    }
}
