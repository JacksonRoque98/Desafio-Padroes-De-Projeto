package funcionario;

public class Copeiro extends Funcionario{

    public Copeiro(){}
    private void preparandoLanche(){
        System.out.println("Bauru saindo...");
    }
    private void preparandoSuco(){
        System.out.println("Suco de laranja saindo...");
    }
    public void servindoCombo(){
        preparandoLanche();
        preparandoSuco();
    }
}
