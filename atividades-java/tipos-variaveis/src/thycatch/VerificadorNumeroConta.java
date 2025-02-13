package thycatch;
import java.util.Scanner;

public class VerificadorNumeroConta {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número da conta (8 dígitos): ");
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}
