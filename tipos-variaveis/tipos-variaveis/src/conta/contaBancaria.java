package conta;

import java.util.Locale;
import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args){
    Scanner scanner = new
    Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Digite  seu primeiro nome:");
    String nomeCliente = scanner.next();


    System.out.println("Digite Sobrenome:");
    String sobrenomeCliente = scanner.next();

    System.out.println("Digite sua agência:");
    String agencia = scanner.next();

    System.out.println("Digite numero:");
    String numero = scanner.next();

    System.out.println("Digite seu saldo bancário:");
    String saldo = scanner.next();

    System.out.println( "Nome Cliente: " + nomeCliente + " " + sobrenomeCliente);
    System.out.println("Agencia: " + agencia);
    System.out.println("Número: " + numero);
    System.out.println("Saldo: " + saldo);
    
    }    
}
