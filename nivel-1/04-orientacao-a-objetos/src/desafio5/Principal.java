package desafio5;

/**
 * Imagine que você está desenvolvendo um sistema acadêmico simplificado para auxiliar professores no acompanhamento
 * de alunos. Seu desafio é criar uma solução que automatize o cálculo de médias e forneça rapidamente o resultado,
 * eliminando a necessidade de cálculos manuais e reduzindo erros.
 *
 * Crie uma classe que:
 *
 * Represente os alunos com os atributos nome, nota 1´ e nota 2`.
 * Implemente um metodo que:
 * Calcule a média das notas.
 * Exiba o nome do aluno, suas notas e a média (com uma casa decimal).
 * Indique se o aluno foi aprovado (média >= 7) ou reprovado.
 */

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Endrew",6.5,7.5);
        System.out.println("Nome: "+aluno.getNome());
        System.out.printf("Nota 1: %.1f\n",aluno.getNota1());
        System.out.printf("Nota 2: %.1f\n",aluno.getNota2());
        System.out.printf("Média: %.1f\n",aluno.retornarMedia());
        System.out.println("Situação: "+aluno.retornarSituacao());
    }
}
