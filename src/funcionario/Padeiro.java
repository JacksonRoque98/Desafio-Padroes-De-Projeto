package funcionario;

public class Padeiro extends Funcionario{
    public Padeiro(){
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
