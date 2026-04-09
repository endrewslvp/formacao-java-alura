package dasafio1;

/**
 * Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos que chegam para manutenção.
 * Cada carro precisa ser identificado com algumas informações para o controle interno.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos modelo, placa e ano.
 * Defina uma instancia dessa classe através do metodo construtor.
 * Exiba as informações do veículo no console.
 */

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Monza","QCY3029",2001);
        System.out.println(carro.toString());
    }
}
