package domain;

public class Professor extends Pessoa{
    private String titulacaoMaxima;

    public void cadastrar() {

    }

    public Professor(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }
}
