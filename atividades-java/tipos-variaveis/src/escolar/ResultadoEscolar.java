package escolar;

public class ResultadoEscolar {
    public static void main(String[] args) {
       int nota = 8;
       //condição composta
       if(nota >= 7)
       System.out.println("Aprovado");

       else
       System.out.println("Reprovado");
       /**
        * Condição ternária:
        int nota = 5;
        String resultado = nota >7 ? "Aprovado" : nota >5 && <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        */
    }
}