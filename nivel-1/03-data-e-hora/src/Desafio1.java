import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Você está desenvolvendo um sistema de log para um aplicativo de gerenciamento de tarefas. Sempre que uma nova tarefa
 * é criada, o sistema deve registrar a data e a hora exatas do momento da criação.
 *
 * Para isso, implemente um programa que:
 *
 * Registre a data e a hora exatas da criação.
 * Exiba essas informações no formato adequado.
 */

public class Desafio1 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("Data atual: "+localDate);
        System.out.println("Hora atual: "+localTime);
    }
}
