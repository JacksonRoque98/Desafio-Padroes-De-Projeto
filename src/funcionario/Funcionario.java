package funcionario;

import pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private char tamanhoUniforme;
    private Integer numeroCartaoDeAcesso;
    private String horarioDeChegada;
    private String horarioDeSaida;
    protected Funcionario(){
    }
    public char getTamanhoUniforme() {
        return tamanhoUniforme;
    }
    public void setTamanhoUniforme(char tamanhoUniforme) {
        this.tamanhoUniforme = tamanhoUniforme;
    }
    public Integer getNumeroCartaoDeAcesso() {
        return numeroCartaoDeAcesso;
    }
    public void setNumeroCartaoDeAcesso(Integer numeroCartaoDeAcesso) {
        this.numeroCartaoDeAcesso = numeroCartaoDeAcesso;
    }
    public String getHorarioDeChegada() {
        return horarioDeChegada;
    }
    public void setHorarioDeChegada(String horarioDeChegada) {
        this.horarioDeChegada = horarioDeChegada;
    }
    public String getHorarioDeSaida() {
        return horarioDeSaida;
    }
    public void setHorarioDeSaida(String horarioDeSaida) {
        this.horarioDeSaida = horarioDeSaida;
    }
}
