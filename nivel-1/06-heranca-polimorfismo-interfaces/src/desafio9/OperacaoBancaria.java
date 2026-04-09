package desafio9;

public abstract class OperacaoBancaria implements AcaoBancaria{

    protected double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }
}
