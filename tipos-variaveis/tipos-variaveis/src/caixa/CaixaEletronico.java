package caixa;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
         //condição simples
        if(valorSolicitado < saldo)
             saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}