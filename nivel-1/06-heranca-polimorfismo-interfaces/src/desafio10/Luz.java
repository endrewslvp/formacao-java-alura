package desafio10;

public class Luz implements  Controlavel{

    private boolean ligado;

    public Luz() {
        this.ligado = false;
    }

    @Override
    public void ligar() {
        if (!ligado){
            ligado = true;
            System.out.println("Luz ligada.");
        }else {
            System.out.println("Luz já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (ligado){
            ligado = false;
            System.out.println("Luz desligada.");
        }else {
            System.out.println("Luz já está desligada.");
        }
    }
}
