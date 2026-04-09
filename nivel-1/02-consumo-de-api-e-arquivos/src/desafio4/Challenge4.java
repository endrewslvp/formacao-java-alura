package desafio4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia um objeto
 * Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */

public class Challenge4 {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(new Marca("Hyundai","HB20",2013),"Cinza","GGK2907");
        ConversorJson2 conversorJson2 = new ConversorJson2();
        System.out.println(conversorJson2.converter(veiculo));
    }
}

class ConversorJson2{
    public String converter (Object obj){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(obj);
    }
}

class Veiculo{
    private Marca marca;
    private String cor;
    private String placa;

    public Veiculo(Marca marca, String cor, String placa) {
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}

class Marca{

    private String nome;
    private String modelo;
    private int anoFabricacao;

    public Marca(String nome, String modelo, int anoFabricacao) {
        this.nome = nome;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
