package desafio7;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getConcluidaToString (){
        return concluida?"Concluída":"A fazer";
    }

    @Override
    public String toString() {
        return "Descrição da tarefa: "+descricao+"\nStatus:"+getConcluidaToString()+"\n";
    }
}
