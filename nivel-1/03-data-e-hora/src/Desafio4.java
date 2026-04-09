import java.text.DateFormat;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Você é responsável pelos projetos em uma empresa de desenvolvimento de software. Para garantir que os prazos sejam cumpridos, você precisa calcular a data de entrega de cada projeto com base na data de início e no prazo estimado em dias.
 *
 * Você precisa criar um programa que:
 *
 * Receba uma data de início.
 * Adicione o prazo em dias ao início do projeto.
 * Exiba a data final formatada corretamente.
 * Saída esperada:
 *
 * Se a data de início for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:
 * Data de entrega: 30-03-2025
 */

public class Desafio4 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dataInicio = LocalDate.of(2025,03,15);
        int prazoDias = 15;
        String dataFinal = dataInicio.plusDays(prazoDias).format(formatter);

        System.out.println("Data de entrega: "+dataFinal);
    }
}
