package desafio4;

public class Usuario {
    private String password;

    public Usuario(String password) {
        this.password = password;
    }

    public void setPassword(String password, String newPassword) {
        if(password.equals(this.password)){
            this.password = newPassword;
            System.out.println("Senha alterada com sucesso!");
        }else{
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
