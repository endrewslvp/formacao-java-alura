package desafio8;

public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void vender(int quantidade){
        if (quantidade>this.quantidade && quantidade>0){
            System.out.println("Estoque insuficiente!");
        }else {
            this.quantidade-=quantidade;
            System.out.println("Venda realizada. Estoque atual: "+this.quantidade);
        }

    }
}
