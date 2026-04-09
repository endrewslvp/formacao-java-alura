package desafio3;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário
 * do GitHub (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada,
 * ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário não
 * for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
 */

public class Challenge3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um perfil:");
            String user = scanner.next();

            ApiRequest apiRequest = new ApiRequest();
            JsonConvert jsonConvert = new JsonConvert();

            GitHubProfile gitHubProfile = jsonConvert.convert(apiRequest.requestGitHubProfile(user));

            System.out.println(gitHubProfile);
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.message);
        }

    }
}

class ApiRequest {
    private String endereco = "https://api.github.com/users/";

    public String requestGitHubProfile(String profile) throws IOException, InterruptedException {
        endereco += profile;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco))
                .headers("Accept","application/vnd.github+json","X-GitHub-Api-Version","2026-03-10")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}

class JsonConvert {
    public GitHubProfile convert (String json){
        Gson gson = new Gson();
        GitHubProfileDTO gitHubProfileDTO = gson.fromJson(json,GitHubProfileDTO.class);
        return new GitHubProfile(gitHubProfileDTO);
    }
}

class GitHubProfile {
    private String name;
    private String userName;
    private String location;
    private String bio;

    public GitHubProfile() {
    }

    public GitHubProfile(String name, String userName, String location, String bio) {
        this.name = name;
        this.userName = userName;
        this.location = location;
        this.bio = bio;
    }

    public GitHubProfile (GitHubProfileDTO gitHubProfileDTO){
        if (gitHubProfileDTO.login()==null) throw new ErroConsultaGitHubException("Não foi possível localizar o usuário.");
        this.name = gitHubProfileDTO.name();
        this.userName = gitHubProfileDTO.login();
        this.location = gitHubProfileDTO.location();
        this.bio = gitHubProfileDTO.bio();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return  "Nome: "+getName()+
                "\nNome de usuário: "+getUserName()+
                "\nLocalização: "+getLocation()+
                "\nBio: "+getBio();
    }
}

record GitHubProfileDTO(String login, String name, String location, String bio){ }

class ErroConsultaGitHubException extends RuntimeException{
    String message;

    public ErroConsultaGitHubException (String s){
        message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

/**
 * Solução do autor:
 */

//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.Scanner;
//
//public class ConsultaGitHub {
//
//    public static void main(String[] args) {
//        Scanner leitura = new Scanner(System.in);
//        System.out.println("Digite o nome de usuário do GitHub para consultar informações: ");
//        String username = leitura.nextLine();
//
//        String endereco = "https://api.github.com/users/" + username;
//
//        try {
//            HttpClient client = HttpClient.newHttpClient();
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create(endereco))
//                    .header("Accept", "application/vnd.github.v3+json")
//                    .build();
//
//            HttpResponse<String> response = client
//                    .send(request, HttpResponse.BodyHandlers.ofString());
//
//            if (response.statusCode() == 404) {
//                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
//            }
//
//            String json = response.body();
//            System.out.println(json);
//
//            // Adicione aqui o código para processar o JSON e exibir as informações desejadas
//        } catch (IOException | InterruptedException e) {
//            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
//            e.printStackTrace();
//        } catch (ErroConsultaGitHubException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//class ErroConsultaGitHubException extends RuntimeException {
//
//    public ErroConsultaGitHubException(String mensagem) {
//        super(mensagem);
//    }
//}