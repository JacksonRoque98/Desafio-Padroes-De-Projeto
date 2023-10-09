package funcionario;

public class Gerente extends Funcionario{
    public Gerente(){}

    private void conferindoEstoqueParaPaes(){
        System.out.println("Conferindo estoque de todos os produtos para fazer pão.");
    }
    private void conferindoEstoqueDeBebidas(){
        System.out.println("Conferindo estoque de todas as bebidas.");
    }
    private void conferindoEstoqueDeDoces(){
        System.out.println("Conferindo estoque de todos os produtos da confeitaria.");
    }
    public void conferindoEstoque(){
        System.out.println("Conferindo estoque de todos os produtos.");
        conferindoEstoqueParaPaes();
        conferindoEstoqueDeDoces();
        conferindoEstoqueDeBebidas();
        System.out.println("Tudo ok!");
    }
}
