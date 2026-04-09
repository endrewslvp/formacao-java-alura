package desafio10;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina (Disciplina disciplina){
        boolean existe = false;
        for (Disciplina disciplina1 : disciplinas){
            if (disciplina1.getNome().equals(disciplina.getNome())){
                existe = true;
            }
        }
        if (!existe){
            disciplinas.add(disciplina);
            System.out.printf("Disciplina de %s adicionada com sucesso!\n",disciplina.getNome());
        }else {
            System.out.println("Disciplina já existe!");
        }

    }

    public void adicionarNotaNaDisciplina (String nome, double nota){
        boolean status = false;
        for(Disciplina disciplina : disciplinas){
            if (disciplina.getNome().equals(nome)){
                disciplina.adicionarNota(nota);
                status = true;
            }
        }
        if (status){
            System.out.printf("Nota adicionada!\n");
        }else {
            System.out.printf("Disciplina não encontrada!\n");
        }
    }

    public void exibirDisciplinas (){
        for (Disciplina disciplina : disciplinas){
            disciplina.exibirDetalhes();
        }
    }
}
