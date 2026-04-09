package desafio5;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.valor).compareTo(outroProduto.getValor());
    }
}
