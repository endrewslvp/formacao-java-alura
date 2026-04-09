package desafio8;

public class Aluno {
    private String login;
    private String password;

    public Aluno(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean validarSenha(String password){
        if (this.password.equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
