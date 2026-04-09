package desafio5;

import java.util.Scanner;

public class Principal {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        Cartao cartao = new Cartao();
        Carrinho carrinho = new Carrinho();

        System.out.println("Digite o limite do cartão: ");
        cartao.setLimite(scanner.nextDouble());

        int opcao = 1;

        while (cartao.getLimite()>0 && opcao==1){

            Produto produto = new Produto();

            System.out.println("Descrição da compra: ");
            produto.setNome(scanner.next());

            System.out.println("Valor da compra: ");
            produto.setValor(scanner.nextDouble());

            if (cartao.realizarCompra(produto)){
                System.out.println("Compra realizada!");
                carrinho.incluirCarrinho(produto);
            }else {
                System.out.println("Saldo insuficiente ou valor inválido cadastrado.");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            opcao = scanner.nextInt();
        }

        if (cartao.getLimite()<0){
            System.out.println("Limite inválido!");
        }else {
            System.out.println("\n*******************\nCompras realizadas\n");
            carrinho.exibirCarrinho();
            System.out.println("\n*******************\n");
            System.out.println("Saldo do cartão: "+cartao.getLimite());
        }
    }
}
