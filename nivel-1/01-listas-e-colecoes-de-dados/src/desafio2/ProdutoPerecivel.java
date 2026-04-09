package desafio2;

public class ProdutoPerecivel extends Produto{
    public String dataValidade;

    public ProdutoPerecivel (String nome, double preco, int quantidade, String dataValidade){
        this.dataValidade = dataValidade;
        super(nome, preco, quantidade);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString()+", data de validade: "+dataValidade;
    }
}
