package pratica.06;

public class Pessoa {
    private String nome;
    private int ano;

    public Pessoa(String nome, int ano) {
        setNome(nome);
        setAnoNascimento(ano);
    }
    public int getAnoNascimento() {
        return ano;
    }
    public void setAnoNascimento(int ano) {
        this.ano = ano;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString() {
        return getNome() + " (nascimento: " + getAnoNascimento() + ")";
    }
}