package carro;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("611611");
        jeep.ligar();

        Moto z400 = new Moto();
       z400.setChassi("544544");
       z400.ligar();
    }
}
