package desafio2;

public class Docente extends Pessoa{

    private String disciplina;

    public Docente (String nome, int idade, String disciplina){
        super(nome,idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+" - Idade: "+getIdade()+" - Disciplina: "+getDisciplina();
    }
}
