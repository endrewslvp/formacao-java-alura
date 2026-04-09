package desafio5;

public class Bateria {
    private int nivel;

    public Bateria(int nivel) {
        setNivel(nivel);
    }

    public void setNivel (int nivel){
        if (nivel>=0&&nivel<=100){
            this.nivel = nivel;
        }else {
            System.out.println("Nível inválido!");
        }
    }

    public int getNivel() {
        return nivel;
    }

    public String status(){
        if (nivel>=80){
            return "Bateria cheia";
        } else if (nivel>=21) {
            return "Bateria ok";
        } else{
            return "Bateria fraca";
        }
    }
}
