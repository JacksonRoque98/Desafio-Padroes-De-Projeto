package funcionario;

public class Caixa extends Funcionario{
    public Caixa(){}
    public void recebendoPagamento(){
        System.out.println("Pagamento efetuado");
        System.out.println("Obrigado e volte sempre.");
    }
    @Override
    public void baterCartaoPontoEntrada() {
        System.out.println("Horario de chegada "+getHorarioDeChegada());
    }
    @Override
    public void baterCartaoPontoSaida() {
        System.out.println("Horario de saida "+getHorarioDeSaida());
    }
}
