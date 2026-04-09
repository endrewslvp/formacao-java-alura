package desafio6;

import java.util.Scanner;

public class Colaborador {
    private String nome;
    private String cargo;
    private int nivelAcesso;

    public Colaborador(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void atualizarDados(String cargo, int nivelAcesso){
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Nível de acesso: " + this.nivelAcesso + "\n");

        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;

        System.out.println("--- Após atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso);
    }
}
