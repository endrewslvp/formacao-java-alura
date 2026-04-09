package desafio9;

/**
 * Imagine que você está desenvolvendo um sistema de pontuação para uma plataforma de estudos. Cada aluno ganha pontos
 * conforme participa de atividades como assistir aulas, responder quizzes ou completar tarefas. Seu objetivo é criar
 * uma classe que gerencie essa pontuação e determine o nível atual do aluno com base na quantidade total de pontos
 * acumulados.
 *
 * Crie uma classe que:
 *
 * Armazene os atributos nome, pontos e nível.
 * Implemente um metodo ganharPontos() para adicionar pontos ao aluno.
 * O nível do aluno deve subir conforme a pontuação total:
 * Nivel 1: 0 a 99 pontos
 * Nível 2: 100 a 199 pontos
 * Nível 3: 200 a 299 pontos
 * E assim por diante (a cada 100 pontos, sobe de nível)
 * Implemente um metodo exibirStatus() que mostre o nome, pontos e nível atual.
 */

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Endrew");
        aluno.ganharPontos(120);
        aluno.exibirStatus();
    }
}
