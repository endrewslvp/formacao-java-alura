package desafio10;

public class ArCondicionado implements Controlavel{

    private boolean ligado;

    public ArCondicionado() {
        this.ligado = false;
    }

    @Override
    public void ligar() {
        if (!ligado){
            ligado = true;
            System.out.println("Ar-condicionado ligado.");
        }else {
            System.out.println("Ar-condicionado já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado){
            ligado = false;
            System.out.println("Ar-condicionado desligado.");
        }else {
            System.out.println("Ar-condicionado já está desligado.");
        }
    }

}
