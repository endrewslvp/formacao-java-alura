package desafio10;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();
    private double somaNotas;
    private double mediaNotas;

    public Disciplina(String nome) {
        this.nome = nome;
        somaNotas = 0.0;
        mediaNotas = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(double nota){
        if (nota>=0 &&  nota<=10) {
            notas.add(nota);
            somaNotas += nota;
            calcularMedia();
        }else {
            System.out.println("A nota deve ser entre 0 e 10.");
        }
    }

    public void exibirNotas (){
        int i = 1;
        for (Double nota : notas){
            System.out.printf("Nota %d: %.2f\n",i,nota);
        }
    }

    private void calcularMedia (){
        mediaNotas = somaNotas/notas.size();
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+nome);
        exibirNotas();
        System.out.printf("Média: %.2f\n",mediaNotas);
    }
}
