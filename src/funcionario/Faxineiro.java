package funcionario;

public class Faxineiro extends Funcionario{
    public Faxineiro(){}
    @Override
    public void baterCartaoPontoEntrada() {
        System.out.println("Horario de chegada "+getHorarioDeChegada());
    }
    @Override
    public void baterCartaoPontoSaida() {
        System.out.println("Horario de saida "+getHorarioDeSaida());
    }
    public void limparChaoManha(){
        System.out.println("Limpando chão as 9h");
    }
    public void limparChaoTarde(){
        System.out.println("Limpando chão as 19h");
    }
}
