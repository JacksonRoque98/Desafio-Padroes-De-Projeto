package cliente;

import funcionario.Caixa;
import pessoa.Pessoa;

public class Cliente extends Pessoa implements MetodoDePagamento{
    private double saldoNoCartao;
    private Integer numeroDaComanda;
    private String formaPagamento;

    public Cliente(){
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
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
    public void comprarPao(){
        System.out.println("10 pães = R$8.50");
    }
    public void pagarConta(){
        if(getFormaPagamento()=="credito"){
            pagamentoCredito();
        } else if (getFormaPagamento()=="debito") {
            pagamentoDebito();
        }else if(getFormaPagamento()=="dinheiro"){
            pagamentoDinheiro();
        }else{
            System.out.println("Pagamento inválido.");
        }
        System.out.println("Realizando pagamento!");
        System.out.println("Pagamento efetuado com sucesso!");
    }
    @Override
    public void pagamentoCredito() {
        System.out.println("Cartão de credito selecionado");
    }
    @Override
    public void pagamentoDebito() {
        System.out.println("Cartão de debito selecionado");
    }
    @Override
    public void pagamentoDinheiro() {
        System.out.println("Pagamento em dinheiro");
    }
}
