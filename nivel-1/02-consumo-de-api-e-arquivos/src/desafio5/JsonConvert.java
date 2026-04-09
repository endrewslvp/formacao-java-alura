package desafio5;

//Classe responsável pela desserialização

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConvert {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static Endereco convertToEndereco(String json){

        EnderecoDTO enderecoDTO = gson.fromJson(json, EnderecoDTO.class);
        return new Endereco(enderecoDTO);
    }

    public static String convertToJson(Object obj){
        return gson.toJson(obj);
    }

}
