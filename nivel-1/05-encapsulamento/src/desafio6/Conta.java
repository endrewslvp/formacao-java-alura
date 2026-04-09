package desafio6;

public class Conta {
    private String titular;
    private double saldo = 0.0;

    public Conta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor>0){
            saldo+=valor;
            System.out.printf("Depósito no valor de R$%.2f feito com sucesso!",valor);
        }else {
            System.out.println("Valor inválido!");
        }
        System.out.printf("\nSaldo atual: R$%.2f \n",saldo);
    }

    public void sacar(double valor){
        if (valor>0){
            if (valor<=saldo){
                saldo-=valor;
                System.out.printf("Saque no valor de R$%.2f feito com sucesso!",valor);
            }else {
                System.out.println("Saldo insuficiente!");
            }
        }else {
            System.out.println("Valor inválido");
        }
        System.out.printf("\nSaldo atual: R$%.2f \n",saldo);
    }
}
