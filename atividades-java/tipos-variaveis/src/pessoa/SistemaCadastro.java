package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema, tera que especificar valores para poder se caso utilizar o metodo construtor
         Pessoa marcos = new Pessoa("123", "MARCOS");
         Pessoa julia = new Pessoa();
        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do marcos?
    }
}
