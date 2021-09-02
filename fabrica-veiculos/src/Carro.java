public class Carro {

    private String cor;
    private String fabricante;
    private String modelo;
    private int ano;
    private int numeroDePortas;
    private Motor motor;
    private boolean isLigado;
    private boolean isMovimento;

    public Carro(Motor motor) {
        this.cor = "Preto";
        this.numeroDePortas = 3;
        this.isLigado = false;
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public boolean isMovimento() {
        return isMovimento;
    }

    public void setMovimento(boolean movimento) {
        isMovimento = movimento;
    }
}