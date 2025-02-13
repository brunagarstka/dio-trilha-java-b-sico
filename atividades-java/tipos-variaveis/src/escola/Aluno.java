package escola;

public class Aluno {
   private String nome;
   private int idade;
   
   private String bruna;
   //digite setb set+inicial ira gerar automaticamente o set
   public void setBruna(String bruna) {
       this.bruna = bruna;
   }
   //digite getb get+inicial ira gerar automaticamente o get
   public String getBruna() {
       return bruna;
   }
   public String getNome() {
    return nome;
   }
   public void setNome(String newNome) {
    this.nome = newNome;
   }
   public int getIdade(){
    return idade;
   }
   public void setIdade(int newIdade) {
    this.idade  = newIdade;
   }
}
