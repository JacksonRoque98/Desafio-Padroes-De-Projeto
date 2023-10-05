package funcionario;

public class Copeiro extends Funcionario{

    public Copeiro(){}
    protected void preparandoLanche(){
        System.out.println("Bauru saindo...");
    }
    protected void preparandoSuco(){
        System.out.println("Suco de laranja saindo...");
    }
    public void servindoCombo(){
        preparandoLanche();
        preparandoSuco();
    }
    @Override
    public void baterCartaoPontoEntrada() {
        System.out.println("Horario de chegada "+getHorarioDeChegada());
    }
    @Override
    public void baterCartaoPontoSaida(){
        System.out.println("Horario de saida "+getHorarioDeSaida());
    }
}
