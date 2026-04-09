import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

/**
 * Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento. Você precisa monitorar o tempo gasto em cada tarefa para garantir que os projetos sejam executados dentro do prazo.
 *
 * Para isso, crie um programa que:
 *
 * Receba dois horários representando o início e o término de uma atividade.
 * Calcule a diferença em horas e minutos entre esses dois horários.
 * Exiba o resultado formatado.
 *
 * Saída esperada:
 *
 * Se o primeiro horário for 14:30:00 e o segundo horário for 16:45:00, a saída deve ser:
 *
 * Diferença de tempo: 2 horas e 15 minutos
 */

public class Desafio3 {
    public static void main(String[] args) {
        LocalTime primeiroHorario = LocalTime.of(14,30,00);
        LocalTime segundoHorario = LocalTime.of(16,45,00);
        Duration diferencaHorarios = Duration.between(primeiroHorario,segundoHorario);
        System.out.printf("Diferença de tempo: %d horas e %d minutos",diferencaHorarios.toHours(),diferencaHorarios.toMinutesPart());
    }
}
