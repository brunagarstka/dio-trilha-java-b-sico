package carro;

public abstract class Veiculo {
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();
    //abstract seria acontece independente da maneira que for ligado
}
