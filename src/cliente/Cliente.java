package cliente;

import pessoa.Pessoa;

public class Cliente extends Pessoa {
    private double saldoNoCartao;

    public double getSaldoDaCarteira(){
        return saldoNoCartao;
    }
    public void setSaldoDaCarteira(double saldoNoCartao){
        this.saldoNoCartao = saldoNoCartao;
    }
    public void verificarSaldoCartao(){
        System.out.println("Possuo R$"+getSaldoDaCarteira()+" no cartão.");
    }
    public void pagarConta(){
        verificarSaldoCartao();
        System.out.println("Realizando pagamento!");
    }
}
