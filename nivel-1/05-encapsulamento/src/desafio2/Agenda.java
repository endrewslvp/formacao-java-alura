package desafio2;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> agenda = new ArrayList<>();

    public void adicionar (Contato contato){
        agenda.add(contato);
    }

    public void exibir (){
        int i=1;
        for(Contato contato : agenda){
            System.out.println(i+"º "+contato.toString());
            i++;
        }
    }
}
