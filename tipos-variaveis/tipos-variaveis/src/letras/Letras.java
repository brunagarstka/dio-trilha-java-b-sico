package letras;

public class Letras {
    public static void main(String[] args) {
        String sigla = "M";
        switch ( sigla) {
        case "P": {
            System.out.println("Pequeno");
            break; //quebra loop
        }
        case "M": {
            System.out.println("Medio");
            break; //quebra loop
        }
        case "G": {
            System.out.println("Grande");
            break; //quebra loop
        }
        default:
        System.out.println("Indefinido");
        }
    }
}
