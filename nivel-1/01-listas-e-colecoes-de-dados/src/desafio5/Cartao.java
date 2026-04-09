package desafio5;

public class Cartao {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean realizarCompra (Produto produto){
        if (produto.getValor() < 0){
            return false;
        }else if (produto.getValor() > getLimite()){
            return false;
        }else{
            limite-=produto.getValor();
            return true;
        }
    }
}
