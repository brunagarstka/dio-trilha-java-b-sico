package mensagens;

public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistorico();
    }
    public void receberMensagem(){
       System.out.println("Recebendo mensagem ");
    }
    private void validarConectadoInternet(){
      System.out.println("validando se esta conectado a internet");
    }
    private void salvarHistorico(){
        System.out.println("Salvando historico da mensagem");
    }
}
