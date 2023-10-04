package funcionario;

import pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private String tamanhoUniforme;
    private Integer numeroCartaoDeAcesso;
    private double salario;
    protected Funcionario(){
    }
    public String getTamanhoUniforme() {
        return tamanhoUniforme;
    }
    public void setTamanhoUniforme(String tamanhoUniforme) {
        this.tamanhoUniforme = tamanhoUniforme;
    }
    public Integer getNumeroCartaoDeAcesso() {
        return numeroCartaoDeAcesso;
    }
    public void setNumeroCartaoDeAcesso(Integer numeroCartaoDeAcesso) {
        this.numeroCartaoDeAcesso = numeroCartaoDeAcesso;
    }
    private double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void horarioDeChegada(){
    }
    public void horarioDeSaida(){
    }
}
