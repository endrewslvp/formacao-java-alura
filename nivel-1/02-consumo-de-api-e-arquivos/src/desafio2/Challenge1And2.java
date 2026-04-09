package desafio2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
 * Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando
 * uma pessoa em um objeto do tipo Pessoa.
 * Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos
 * estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação
 * da biblioteca Gson para flexibilizar a conversão.
 */

public class Challenge1And2 {
    public static void main(String[] args) {

        String json = """
                {
                    "Nome" : "Endrew",
                    "Idade" : "21",
                    "Cidade" : "SP"
                }
                """;

        Gson gson =  new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create(); //Permite converte a chave para camelCase
        PessoaDTO pessoaDTO = gson.fromJson(json, PessoaDTO.class);
        Pessoa pessoa = new Pessoa(pessoaDTO);

        System.out.println(pessoa);
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Pessoa (PessoaDTO pessoaDTO){
        this.nome = pessoaDTO.nome();
        this.idade = Integer.valueOf(pessoaDTO.idade());
        this.cidade = pessoaDTO.cidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+
                "\nIdade: "+getIdade()+
                "\nCidade: "+getCidade();
    }
}

record PessoaDTO (String nome, String idade, String cidade){}
