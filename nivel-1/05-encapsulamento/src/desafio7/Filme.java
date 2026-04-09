package desafio7;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private double mediaAvalicoes = 0.0;
    private double somaAvaliacoes = 0;
    ArrayList<Integer> avaliacoes = new ArrayList<>();

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getMediaAvalicoes() {
        return mediaAvalicoes;
    }

    public void avaliar(int avaliacao) {
        if (avaliacao>=1 && avaliacao<=5){
            avaliacoes.add(avaliacao);
            somaAvaliacoes+=avaliacao;
            setMediaAvalicoes();
        }else {
            System.out.println("A avaliação deve ser entre 1 a 5");
        }
    }

    private void setMediaAvalicoes(){
        mediaAvalicoes = (double) somaAvaliacoes/avaliacoes.size();
    }
}
