package pratica.07;

public class Endereco {

    private int CEP;
    private int numero;
    private String rua;
    private String setor;

    public Endereco(String rua, String setor) {
        super();
        this.cep = cep;
        this.numero = numero;
        this.rua = rua;
        this.setor = setor;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}