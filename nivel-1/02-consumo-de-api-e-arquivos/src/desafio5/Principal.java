package desafio5;

import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.Scanner;

/**
 * Criar uma aplicação para consultar a API ViaCEP
 * Menu para o usuário informar o CEP para busca
 * Geração de um arquivo .JSON com os dados do endereço
 */

public class Principal {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o cep do seu endereço:");
        String cep = scanner.next();

        try {
            endereco = JsonConvert.convertToEndereco(ApiRequest.cepRequest(cep));
            System.out.println("\nEndereço encontrado:");
            System.out.println(endereco);
        }catch (CepNaoEncontradoException e){
            System.out.println(e.getMessage());
        }catch (JsonSyntaxException e){
            System.out.println("Cep inválido!\nErro: "+e.getMessage());
        }catch (IOException | InterruptedException e){
            System.out.println("Aconteceu um erro ao chamar a API. \nTente novamente mais tarde");
        }

        int option = 0;

        while (true){
            System.out.println("\nDeseja criar um arquivo com essas informações?");
            System.out.println("1. Sim\n2. Não");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    try {
                        System.out.println("O arquivo está sendo gerado.");
                        FileCreator.create("Endereco", "txt", JsonConvert.convertToJson(endereco));
                    }catch (IOException e){
                        System.out.println("Aconteceu um erro ao gerar o arquivo. \nTente novamente mais tarde");
                        continue;
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
            }
            break;
        }
    }
}
