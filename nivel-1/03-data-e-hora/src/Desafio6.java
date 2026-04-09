import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Você trabalha em uma agência de turismo e é responsável pelo agendamento de eventos como passeios e excursões.
 * Para garantir uma boa organização, o sistema precisa verificar se um evento já ocorreu ou ainda está por vir com
 * base na data atual.
 *
 * Crie um programa que:
 *
 * Receba uma data de evento previamente cadastrada.
 * Compare essa data com a data atual.
 * Exiba a data do evento e a data atual no formato dd-MM-yyyy.
 * Informe se o evento já ocorreu ou ainda está por vir.
 * Saída esperada:
 *
 * Se a data do evento for 10 de março de 2025 e a data atual for 15 de março de 2025, a saída deve ser:
 * Data do evento: 10-03-2025
 * Data atual: 15-03-2025
 * O evento já ocorreu.
 */

public class Desafio6 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataEvento = LocalDate.of(2025,3,10);
        System.out.println("Data do evento: "+dataEvento.format(formatter));
        System.out.println("Data atual: "+LocalDate.now().format(formatter));

        String response = dataEvento.isBefore(LocalDate.now())?"O evento já ocorreu."
                        :(dataEvento.isAfter(LocalDate.now())?"O evento está por vir."
                        :"O evento é hoje.");
        System.out.println(response);

//        if (dataEvento.isBefore(LocalDate.now())){
//            System.out.println("O evento já ocorreu.");
//        } else if (dataEvento.isAfter(LocalDate.now())) {
//            System.out.println("O evento está por vir.");
//        }else {
//            System.out.println("O evento é hoje.");
//        }

    }
}
