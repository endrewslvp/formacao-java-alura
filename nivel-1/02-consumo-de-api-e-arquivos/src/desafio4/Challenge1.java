package desafio4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado
 * "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
 */

public class Challenge1 {
    public static void main(String[] args) {
        ArchiveCreator archiveCreator = new ArchiveCreator();
        archiveCreator.create("arquivo","txt","Conteúdo a ser gravado no arquivo.");
    }
}

class ArchiveCreator{
    public void create(String fileName, String extension, String message){
        try{
            FileWriter fileWriter = new FileWriter(fileName+"."+extension);
            fileWriter.write(message);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
