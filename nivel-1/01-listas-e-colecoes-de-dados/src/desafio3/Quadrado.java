package desafio3;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea(){
        return lado*lado;
    }

    @Override
    public String toString() {
        return "Quadrado: "+getArea()+" de área.";
    }
}
