package smart;
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("a SmartTv está ligada? " + smartTv.ligada);
        System.out.println("A SmartTv está no canal: " + smartTv.canal);
        System.out.println("A SmartTv estsaá no volume: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("A SmartTv está ligada? " + smartTv.ligada);
 
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("A SmartTv está no volume: " + smartTv.volume);
        
        System.out.println("A SmartTv está no canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("A SmartTv está no canal: " + smartTv.canal);
        
        smartTv.mudarCanal(3);
        System.out.println("A SmartTv está no canal: " + smartTv.canal);

    }
}
