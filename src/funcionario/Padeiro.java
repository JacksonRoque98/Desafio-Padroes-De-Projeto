package funcionario;

public class Padeiro extends Funcionario{
    public Padeiro(){
    }
    @Override
    public void baterCartaoPontoEntrada() {
        System.out.println("Horario de chegada as 5h");
    }
    @Override
    public void baterCartaoPontoSaida(){
        System.out.println("Horario de saida as 14h");
    }
    protected void preparandoMassaDePao(){
        System.out.println("Preparando a massa do pão.");
        System.out.println("...");
    }
    protected void paoNoForno(){
        System.out.println("Colocando o pão no forno.");
        System.out.println("...");
    }
    protected void entregandoPaoAoBalconista(){
        System.out.println("Entregando cesto de pães aos balconistas.");
    }
    public void etapasPrepararPao(){
        preparandoMassaDePao();
        paoNoForno();
        entregandoPaoAoBalconista();
    }
}
