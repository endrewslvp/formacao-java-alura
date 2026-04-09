package desafio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest
 * e HttpResponse. Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre
 * essa receita.
 */

public class Challenge3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ApiRequest2 request = new ApiRequest2();

        System.out.println("Digite o prato que deseja pesquisar:");
        String prato = scanner.next();
        System.out.println(request.requestTheMealDB(prato));
    }
}

class ApiRequest2{

    public String requestTheMealDB(String name) throws IOException, InterruptedException {

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s="+name;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        return json;
    }
}


