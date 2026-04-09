package desafio5;

public class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String confirmarPagamento (){
        return String.format("Pagamento no valor de R$%.2f via %s confirmado!",valor,this.getClass().getSimpleName());
    }
}
