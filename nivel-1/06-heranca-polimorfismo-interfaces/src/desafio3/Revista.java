package desafio3;

public class Revista extends Midia{

    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String exibirInfo(){
        return super.exibirInfo()+" | Revista: "+getTitulo()+" - Edição: "+getEdicao();
    }
}
