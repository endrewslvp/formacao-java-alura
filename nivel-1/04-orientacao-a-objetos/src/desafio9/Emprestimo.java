package desafio9;

public class Emprestimo {
    private String titulo;
    private int diasAtraso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public double calcularAtraso(){
        return diasAtraso*2.5;
    }
}
