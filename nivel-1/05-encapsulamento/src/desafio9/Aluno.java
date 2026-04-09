package desafio9;

public class Aluno {
    private String nome;
    private int pontos;
    private String nivel;

    public Aluno(String nome) {
        this.nome = nome;
        pontos = 0;
        nivel = atribuirNivel ();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void ganharPontos(int pontos){
        if (pontos>0){
            this.pontos+=pontos;
            nivel = atribuirNivel();
        }
    }

    private String atribuirNivel (){
        if (pontos<99){
            return "Nível 1";
        }else if(pontos<199){
            return "Nível 2";
        } else {
            return "Nivel 3";
        }
    }

    public void exibirStatus(){
        System.out.println("Nome: "+nome);
        System.out.println("Pontos: "+pontos);
        System.out.println("Nível: "+nivel);
    }
}
