package Modelo;

public class Endereco {
    private int cep ;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private int ddd;

    public Endereco(int cep, String logradouro, String complemento, String bairro, String localidade, String uf, int ddd) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep=" + cep +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ddd=" + ddd +
                '}';
    }
}


