package mensagens;

public class ComputadorPedrinho {
   public static void main(String[] args) {
    MSNMesseger msn = new MSNMesseger();
    msn.enviarMensagem();
    msn.receberMensagem();

    FacebookMesseger fcb = new FacebookMesseger();
    fcb.enviarMensagem();
    fcb.receberMensagem();

    Telegram tlg = new Telegram();
    tlg.enviarMensagem();
    tlg.receberMensagem();
   }    
}
