package desafio5;

public class Boleto extends Pagamento {

    private double taxa = 0.01;
    private double valorTaxa;

    public Boleto(double valor) {
        super(valor);
        this.valorTaxa = valor*taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getValorTaxa() {
        return valorTaxa;
    }

    @Override
    public String confirmarPagamento() {
        return super.confirmarPagamento()+String.format(" (Taxa: R$%.2f)",valorTaxa);
    }
}
