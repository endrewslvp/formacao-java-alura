package desafio4;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge2And3 {
    static void main() {
        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("God of War"));
        titulos.add(new Titulo("Resident Evil 4"));
        titulos.add(new Titulo("GTA"));
        titulos.add(new Titulo("Avatar"));
        Collections.sort(titulos);
        System.out.println(titulos);
    }
}

class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return nome.compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
}
