package desafio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse
 * para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda
 * escolhida pelo usuário.
 */

public class Challenge2 {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a moeda que deseja pesquisar:");
        String moeda = scanner.next();
        System.out.println("Digite o sistema monetário que quer retornar (ex: USD, BRL, EUR):");
        String currencie = scanner.next();

        ApiRequest request = new ApiRequest();
        System.out.println(request.requestCoinGecko(moeda,currencie));
    }
}

class ApiRequest{

    public String requestCoinGecko (String coin, String currencie) throws IOException, InterruptedException {

        String key = "";
        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies="+currencie+"&ids="+coin+"&x_cg_demo_api_key="+key;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }

}
