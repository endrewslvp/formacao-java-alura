package desafio5;

//Classe responsável por fazer a requisição e retornar o json em String

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {

    private static String endereco = "https://viacep.com.br/ws/";
    private static String formart = "/json/";

    public static String cepRequest(String cep) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco+cep+formart)).build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

}
