package cliente;

import pessoa.Pessoa;

public class Cliente extends Pessoa {
    private double saldoNoCartao;
    private Integer numeroDaComanda;
    public Cliente(){
    }
    public double getSaldoDaCarteira(){
        return saldoNoCartao;
    }
    public void setSaldoDaCarteira(double saldoNoCartao){
        this.saldoNoCartao = saldoNoCartao;
    }
    public Integer getNumeroDaComanda() {
        return numeroDaComanda;
    }
    public void setNumeroDaComanda(Integer numeroDaComanda) {
        this.numeroDaComanda = numeroDaComanda;
    }
    protected void verificarSaldoCartao(){
        System.out.println("Seu saldo é de R$"+getSaldoDaCarteira());
    }
    public void pagarConta(){
        verificarSaldoCartao();
        System.out.println("Realizando pagamento!");
    }
}
