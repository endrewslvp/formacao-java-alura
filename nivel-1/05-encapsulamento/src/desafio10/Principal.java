package desafio10;

/**
 * Você está desenvolvendo um módulo acadêmico para registrar o desempenho dos alunos em cada disciplina. O sistema
 * precisa ser flexível para receber diferentes quantidades de notas, mas deve garantir que todas estejam dentro do
 * intervalo válido.
 *
 * Crie um programa que:
 *
 * Defina uma classe que armazene o nome da disciplina e a lista das notas dos alunos
 * Valide se cada nota está entre 0 e 10
 * Calcule a média apenas das notas válidas
 * Informe quantas notas foram registradas com sucesso e quantas foram ignoradas
 */

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Endrew");
        aluno.adicionarDisciplina(new Disciplina("Matemática"));
        aluno.adicionarNotaNaDisciplina("Matemática",5);
        aluno.adicionarNotaNaDisciplina("Matemática",10);
        aluno.adicionarDisciplina(new Disciplina("Matemática"));
        aluno.adicionarNotaNaDisciplina("Português",9);
        aluno.adicionarNotaNaDisciplina("Português",8);
        aluno.exibirDisciplinas();
    }
}
