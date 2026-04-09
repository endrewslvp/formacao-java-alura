package desafio5;

//Classe-entidade para abrigar o objeto do endereço

public class Endereco {

    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco() {
    }

    public Endereco(String cep, String rua, String bairro, String cidade, String uf) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Endereco (EnderecoDTO enderecoDTO){
        if (enderecoDTO.cep()==null) throw new CepNaoEncontradoException("Cep não encontrado");
        this.cep = enderecoDTO.cep();
        this.rua = enderecoDTO.logradouro();
        this.bairro = enderecoDTO.bairro();
        this.cidade = enderecoDTO.localidade();
        this.uf = enderecoDTO.uf();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Rua: "+getRua()+
                "\nBairro: "+getBairro()+
                "\nCEP: "+getCep()+
                "\nCidade: "+getCidade()+
                "\nUF: "+getUf();
    }
}
