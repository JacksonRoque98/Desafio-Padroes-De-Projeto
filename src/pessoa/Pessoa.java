package pessoa;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String cpf;
    private char sexo;
    /*Construtor protect impede que a classe Pessoa seja instanciada pelo Main!
    Permitindo que ela seja extendida para outras classes filhas
    reeutilizando os atributos e os metodos.*/
    protected Pessoa(){
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    protected void andar(){
    }
    protected void falar(){
    }
}
