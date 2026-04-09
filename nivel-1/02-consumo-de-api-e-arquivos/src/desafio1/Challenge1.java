package desafio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma
 * consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações
 * disponíveis sobre o livro retornado pela API.
 *
 * Status: Não finalizado. Erro 403
 */

public class Challenge1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ApiRequest3 apiRequest3 = new ApiRequest3();
        System.out.println("Digite o livro que deseja buscar:");
        String vol = scanner.next();
        System.out.println(apiRequest3.requestGoogleBooks(vol));
    }
}

class ApiRequest3{
    public String requestGoogleBooks(String vol) throws IOException, InterruptedException {

        String key = "";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + vol + "&key=" + key;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
