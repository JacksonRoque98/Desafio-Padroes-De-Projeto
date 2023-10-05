import cliente.Cliente;
import funcionario.Padeiro;
public class Main {
    public static void main(String[] args) {
        //Instanciando classe padaria
        Padaria padariaBomPao = new Padaria();
        //Definindo horario de abertura e encerramento
        padariaBomPao.setHorarioDeAbertura("06:00");
        padariaBomPao.setHorarioDeFechar("22:00");
        System.out.println("Horario de abertura - "+padariaBomPao.getHorarioDeAbertura());
        System.out.println("Horario de encerramento - "+padariaBomPao.getHorarioDeFechar());

        //Instanciando classe Padeiro
        Padeiro padeiroFrancisco = new Padeiro();
        padeiroFrancisco.setNome("Francisco");
        padeiroFrancisco.setIdade(47);
        padeiroFrancisco.setSexo('M');
        padeiroFrancisco.setTamanhoUniforme('G');
        padeiroFrancisco.setNumeroCartaoDeAcesso(01324);
        padeiroFrancisco.setHorarioDeChegada("05:00AM");
        padeiroFrancisco.setHorarioDeSaida("14:00PM");
        System.out.println("O padeiro "+padeiroFrancisco.getNome()+
                " tem "+padeiroFrancisco.getIdade()+
                " anos, usa uniforme de tamanho "+padeiroFrancisco.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+padeiroFrancisco.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+padeiroFrancisco.getHorarioDeChegada()+
                " e horario de saida as "+padeiroFrancisco.getHorarioDeSaida());



    }
}