package carro;
//apos colocar extends Veiculo esta tendo herança de codigo, por exemplo o carro não ter chassi agr tem
public class Carro extends Veiculo{
    
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    //encapsulamento colocar em privado e por a função para rodar dentro de um só metodo
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio");
    }
}
