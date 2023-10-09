import cliente.Cliente;
import funcionario.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----PADARIA BOM PÃO-----");
        //Instanciando classe padaria
        Padaria padariaBomPao = new Padaria();
        //Definindo horario de abertura e encerramento
        padariaBomPao.setHorarioDeAbertura("06:00");
        padariaBomPao.setHorarioDeFechar("22:00");
        System.out.println("-Bem vindos a padaria Bom Pão-");
        System.out.println("Horario de abertura - "+padariaBomPao.getHorarioDeAbertura());
        System.out.println("Horario de encerramento - "+padariaBomPao.getHorarioDeFechar());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando a classe Padeiro Francisco
        Padeiro padeiroFrancisco = new Padeiro();
        padeiroFrancisco.setNome("Francisco");
        padeiroFrancisco.setIdade(47);
        padeiroFrancisco.setSexo('M');
        padeiroFrancisco.setTamanhoUniforme('G');
        padeiroFrancisco.setNumeroCartaoDeAcesso(2);
        padeiroFrancisco.setHorarioDeChegada("05:00AM");
        padeiroFrancisco.setHorarioDeSaida("14:00PM");
        System.out.println("\nO padeiro "+padeiroFrancisco.getNome()+" sempre é o primeiro a chegar!\nEle chega as "+padeiroFrancisco.getHorarioDeChegada());
        System.out.println("O padeiro "+padeiroFrancisco.getNome()+
                " tem "+padeiroFrancisco.getIdade()+
                " anos, usa uniforme de tamanho "+padeiroFrancisco.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+padeiroFrancisco.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+padeiroFrancisco.getHorarioDeChegada()+
                " e horario de saida as "+padeiroFrancisco.getHorarioDeSaida());
        System.out.println("Ele é o responsável por fazer os pães antes da padaria ser aberta!");
        padeiroFrancisco.etapasPrepararPao();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando a classe Padeiro Jose
        Padeiro padeiroJose = new Padeiro();
        padeiroJose.setNome("Jose");
        padeiroJose.setIdade(44);
        padeiroJose.setSexo('M');
        padeiroJose.setTamanhoUniforme('G');
        padeiroJose.setNumeroCartaoDeAcesso(6);
        padeiroJose.setHorarioDeChegada("14:00PM");
        padeiroJose.setHorarioDeSaida("22:00PM");
        System.out.println("Após as "+padeiroFrancisco.getHorarioDeSaida()+", o "+padeiroFrancisco.getNome()+" encerra seu turno, e " +
                "o padeiro "+padeiroJose.getNome()+" começa seu expediente!");
        System.out.println("O padeiro "+padeiroJose.getNome()+
                " tem "+padeiroJose.getIdade()+
                " anos, usa uniforme de tamanho "+padeiroJose.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+padeiroJose.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+padeiroJose.getHorarioDeChegada()+
                " e horario de saida as "+padeiroJose.getHorarioDeSaida());
        System.out.println("Ele é o responsável por fazer os pães até o horario da padaria ser fechada!");
        padeiroJose.etapasPrepararPao();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando classe Gerente
        Gerente gerenteCaio = new Gerente();
        gerenteCaio.setNome("Caio");
        gerenteCaio.setIdade(30);
        gerenteCaio.setSexo('M');
        gerenteCaio.setTamanhoUniforme('M');
        gerenteCaio.setNumeroCartaoDeAcesso(1);
        gerenteCaio.setHorarioDeChegada("05:30AM");
        gerenteCaio.setHorarioDeSaida("17:00PM");
        System.out.println("Nosso gerente "+gerenteCaio.getNome()+" sempre chega logo após o padeiro "+padeiroFrancisco.getNome()+
                ". \nPois é ele quem cuida das necessidades da padaria, e controla os horarios dos funcionarios!");
        System.out.println("O gerente "+gerenteCaio.getNome()+
                " tem "+gerenteCaio.getIdade()+
                " anos, usa uniforme de tamanho "+gerenteCaio.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+gerenteCaio.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+gerenteCaio.getHorarioDeChegada()+
                " e horario de saida as "+gerenteCaio.getHorarioDeSaida());
        gerenteCaio.conferindoEstoque();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando classe Copeiro Ana
        Copeiro copeiroAna = new Copeiro();
        copeiroAna.setNome("Ana");
        copeiroAna.setIdade(22);
        copeiroAna.setSexo('F');
        copeiroAna.setTamanhoUniforme('P');
        copeiroAna.setNumeroCartaoDeAcesso(3);
        copeiroAna.setHorarioDeChegada("06:00AM");
        copeiroAna.setHorarioDeSaida("14:00PM");
        System.out.println("Nossa copeira "+copeiroAna.getNome()+" chega as 06:00AM\nEla é a responsável por servir os cliente!");
        System.out.println("A copeira "+copeiroAna.getNome()+
                " tem "+copeiroAna.getIdade()+
                " anos, usa uniforme de tamanho "+copeiroAna.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+copeiroAna.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+copeiroAna.getHorarioDeChegada()+
                " e horario de saida as "+copeiroAna.getHorarioDeSaida());
        copeiroAna.servindoCombo();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando classe Copeiro Claudia
        Copeiro copeiroClaudia = new Copeiro();
        copeiroClaudia.setNome("Claudia");
        copeiroClaudia.setIdade(26);
        copeiroClaudia.setSexo('F');
        copeiroClaudia.setTamanhoUniforme('P');
        copeiroClaudia.setNumeroCartaoDeAcesso(7);
        copeiroClaudia.setHorarioDeChegada("14:00PM");
        copeiroClaudia.setHorarioDeSaida("22:00PM");
        System.out.println("Após as 14:00AM, a "+copeiroAna.getNome()+" encerra seu turno, e " +
                "a copeira "+copeiroClaudia.getNome()+" começa seu expediente!");
        System.out.println("A copeira "+copeiroClaudia.getNome()+
                " tem "+copeiroClaudia.getIdade()+
                " anos, usa uniforme de tamanho "+copeiroClaudia.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+copeiroClaudia.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+copeiroClaudia.getHorarioDeChegada()+
                " e horario de saida as "+copeiroClaudia.getHorarioDeSaida());
        copeiroClaudia.servindoCombo();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando classe Caixa Julia
        Caixa caixaJulia = new Caixa();
        caixaJulia.setNome("Julia");
        caixaJulia.setIdade(33);
        caixaJulia.setSexo('F');
        caixaJulia.setTamanhoUniforme('M');
        caixaJulia.setNumeroCartaoDeAcesso(4);
        caixaJulia.setHorarioDeChegada("06:00AM");
        caixaJulia.setHorarioDeSaida("14:00PM");
        System.out.println("Nossa operadora de caixa "+caixaJulia.getNome()+" chega as 06:00AM\nEla é a responsável por receber o pagamento dos clientes!");
        System.out.println("A operadora de caixa "+caixaJulia.getNome()+
                " tem "+caixaJulia.getIdade()+
                " anos, usa uniforme de tamanho "+caixaJulia.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+caixaJulia.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+caixaJulia.getHorarioDeChegada()+
                " e horario de saida as "+caixaJulia.getHorarioDeSaida());
        caixaJulia.recebendoPagamento();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando classe Caixa Lene
        Caixa caixaLene = new Caixa();
        caixaLene.setNome("Lene");
        caixaLene.setIdade(23);
        caixaLene.setSexo('F');
        caixaLene.setTamanhoUniforme('P');
        caixaLene.setNumeroCartaoDeAcesso(8);
        caixaLene.setHorarioDeChegada("14:00PM");
        caixaLene.setHorarioDeSaida("22:00PM");
        System.out.println("Após as 14:00AM, a "+caixaJulia.getNome()+" encerra seu turno, e " +
                "a operadora "+caixaLene.getNome()+" começa seu expediente!");
        System.out.println("A operadora de caixa "+caixaLene.getNome()+
                " tem "+caixaLene.getIdade()+
                " anos, usa uniforme de tamanho "+caixaLene.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+caixaLene.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+caixaLene.getHorarioDeChegada()+
                " e horario de saida as "+caixaLene.getHorarioDeSaida());
        caixaLene.recebendoPagamento();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando a classe faxineiro
        Faxineiro faxineiroPedro = new Faxineiro();
        faxineiroPedro.setNome("Pedro");
        faxineiroPedro.setIdade(19);
        faxineiroPedro.setSexo('M');
        faxineiroPedro.setNumeroCartaoDeAcesso(5);
        faxineiroPedro.setTamanhoUniforme('M');
        faxineiroPedro.setHorarioDeChegada("08:00AM");
        faxineiroPedro.setHorarioDeSaida("17:00PM");
        System.out.println("O faxineiro "+faxineiroPedro.getNome()+
                " tem "+faxineiroPedro.getIdade()+
                " anos, usa uniforme de tamanho "+faxineiroPedro.getTamanhoUniforme()+
                " e o numero do seu cartao de acesso é: "+faxineiroPedro.getNumeroCartaoDeAcesso()+
                ". \nSeu horario de trabalho é das "+faxineiroPedro.getHorarioDeChegada()+
                " e horario de saida as "+faxineiroPedro.getHorarioDeSaida());
        System.out.println("O faxineiro "+faxineiroPedro.getNome()+" é o responsável por manter o ambiente limpo!");
        faxineiroPedro.limparChaoManha();
        faxineiroPedro.limparChaoTarde();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando a classe Cliente Jackson
        Cliente clienteJackson = new Cliente();
        clienteJackson.setNome("Jackson");
        clienteJackson.setIdade(25);
        clienteJackson.setSexo('M');
        clienteJackson.setNumeroDaComanda(12);
        clienteJackson.setSaldoDaCarteira(124.30);
        clienteJackson.setFormaPagamento("credito");
        System.out.println("O cliente "+clienteJackson.getNome()+" de "+clienteJackson.getIdade()
        +" anos, chegou a padaria, pegou uma comanda com o número: "+clienteJackson.getNumeroDaComanda()+
                " e foi fazer seu pedido no balcão de pães!");
        clienteJackson.comprarPao();
        System.out.println("Após pedir o pão, "+clienteJackson.getNome()+" se direcionou até o caixa para efetuar o pagamento.");
        System.out.println("Sua forma de pagamento será "+clienteJackson.getFormaPagamento());
        clienteJackson.pagarConta();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando a classe Cliente Matheus
        Cliente clienteMatheus = new Cliente();
        clienteMatheus.setNome("Matheus");
        clienteMatheus.setIdade(15);
        clienteMatheus.setSexo('M');
        clienteMatheus.setNumeroDaComanda(27);
        clienteMatheus.setSaldoDaCarteira(10.0);
        clienteMatheus.setFormaPagamento("dinheiro");
        System.out.println("O cliente "+clienteMatheus.getNome()+" de "+clienteMatheus.getIdade()
                +" anos, chegou a padaria, pegou uma comanda com o número: "+clienteMatheus.getNumeroDaComanda()+
                " e foi fazer seu pedido no balcão de pães!");
        clienteMatheus.comprarPao();
        System.out.println("Após pedir o pão, "+clienteMatheus.getNome()+" se direcionou até o caixa para efetuar o pagamento.");
        System.out.println("Sua forma de pagamento será "+clienteMatheus.getFormaPagamento());
        clienteMatheus.pagarConta();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Instanciando a classe Cliente Jhow
        Cliente clienteJhow = new Cliente();
        clienteJhow.setNome("Jhow");
        clienteJhow.setIdade(18);
        clienteJhow.setSexo('M');
        clienteJhow.setNumeroDaComanda(27);
        clienteJhow.setSaldoDaCarteira(27.0);
        clienteJhow.setFormaPagamento("debito");
        System.out.println("O cliente "+clienteJhow.getNome()+" de "+clienteJhow.getIdade()
                +" anos, chegou a padaria, pegou uma comanda com o número: "+clienteJhow.getNumeroDaComanda()+
                " e foi fazer seu pedido no balcão de pães!");
        clienteJhow.comprarPao();
        System.out.println("Após pedir o pão, "+clienteJhow.getNome()+" se direcionou até o caixa para efetuar o pagamento.");
        System.out.println("Sua forma de pagamento será "+clienteJhow.getFormaPagamento());
        clienteJhow.pagarConta();

    }
}