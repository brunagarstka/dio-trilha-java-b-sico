package smart;
public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentou o volume para: " + volume) ;   
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuiu o volume para: " + volume);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
} 
