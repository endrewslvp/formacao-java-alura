package desafio3;

public class Triangulo implements Forma {
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (altura*base)/2;
    }

    @Override
    public String toString() {
        return "Triangulo: "+getArea()+" de área.";
    }
}
