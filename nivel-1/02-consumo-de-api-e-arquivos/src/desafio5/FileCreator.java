package desafio5;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void create (String nameFile, String formart, String message) throws IOException {
        FileWriter fileWriter = new FileWriter(nameFile+"."+formart);
        fileWriter.write(message);
        fileWriter.close();
    }
}
