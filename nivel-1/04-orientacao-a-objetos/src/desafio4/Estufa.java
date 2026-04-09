package desafio4;

public class Estufa {
    private String local;
    private double temperaturaAtual;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void exibirInformacoes(){
        System.out.println("Senso no local: "+local);
        System.out.printf("Temperatura: %.1f °C\n",temperaturaAtual);
        System.out.println(temperaturaAtual>37.5?"Temperatura acima do limite!":"Temperatura normal");
    }
}
