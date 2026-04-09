package desafio5;

import java.util.ArrayList;
import java.util.Collections;

public class Carrinho {

    ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void incluirCarrinho (Produto produto){
        listaProdutos.add(produto);
    }

    public void exibirCarrinho (){
        Collections.sort(listaProdutos);
        for (Produto produto : listaProdutos) {
            System.out.println(produto.getNome()+" - R$"+produto.getValor());
        }
    }

}
