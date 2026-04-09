package desafio2;

public class Aluno extends Pessoa{

    private int nota;

    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+" - Idade: "+getIdade()+" - Nota: "+getNota();
    }
}
