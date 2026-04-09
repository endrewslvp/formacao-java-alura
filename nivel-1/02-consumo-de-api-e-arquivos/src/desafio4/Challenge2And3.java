package desafio4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia um objeto
 * Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado. Modifique o programa anterior
 * para que o JSON gerado seja formatado de maneira mais elegante. Utilize o metodo setPrettyPrinting para alcançar esse
 * resultado.
 */

public class Challenge2And3 {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Pequeno principe",2013,new Editora("Panini","SP"));
        ConversorJson conversorJson = new ConversorJson();
        System.out.println(conversorJson.converter(titulo));
    }
}

class ConversorJson{
    public String  converter (Object obj) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(obj);
    }
}

class Titulo{
    private String nome;
    private int ano;
    private Editora editora;

    public Titulo(String nome, int ano, Editora editora) {
        this.nome = nome;
        this.ano = ano;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+" ("+getAno()+")\n"+editora.toString();

    }
}

class Editora{
    private String nome;
    private String cidade;

    public Editora(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+" ("+getCidade()+")";
    }
}
