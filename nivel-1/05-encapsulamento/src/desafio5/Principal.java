package desafio5;

/**
 * Imagine que você está desenvolvendo um sistema para dispositivos portáteis, onde precisa monitorar o nível de
 * energia da bateria. O dispositivo deve informar ao usuário o status atual da bateria, garantindo que os valores
 * sempre estejam dentro de um intervalo válido.
 *
 * Crie um programa que:
 *
 * Defina uma classe que armazene o nível da bateria.
 * Permita definir o nível apenas se estiver entre 0 e 100.
 * Forneça uma forma de exibir o status da bateria com base no nível atual:
 * Até 20%: “Bateria fraca”
 * Entre 21% e 79% : “Bateria ok”
 * Igual ou acima de 80%: “Bateria cheia”
 * Instancie essa classe, defina um nível e exiba o status.
 */

public class Principal {
    public static void main(String[] args) {
        Bateria bateria = new Bateria(15);
        System.out.println(bateria.status());
    }
}
