package desafio10;

import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> carrinho = new ArrayList<>();
    private double total = 0.0;

    public void adicionar(Produto produto){
        carrinho.add(produto);
    }

    public double calcularTotal(){
        for (Produto produto : carrinho){
            total += produto.getPreco()* produto.getQuantidade();
        }
        return total;
    }

}
