package funcionario;

public class Gerente extends Funcionario{
    public Gerente(){}
    @Override
    public void baterCartaoPontoEntrada() {
        System.out.println("Horario de chegada "+getHorarioDeChegada());
    }
    @Override
    public void baterCartaoPontoSaida() {
        System.out.println("Horario de saida "+getHorarioDeSaida());
    }
}
