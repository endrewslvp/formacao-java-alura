package desafio7;

import java.time.LocalDate;
import java.util.Date;

public class Reserva {

    public void reservar(){
        System.out.println("Reserva realizada.");
    }

    public void reservar(LocalDate date){
        System.out.printf("Reserva feita para o dia %tD.\n",date);
    }

    public void reservar(LocalDate date,int quantidadePessoas){
        System.out.printf("Reserva feita para o dia %tD para %d pessoa(s).\n",date,quantidadePessoas);
    }

}
