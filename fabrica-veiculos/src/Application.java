public class Application {

    public static void main(String[] args) {

        FabricaFiat fabricaFiat = new FabricaFiat();
        FabricaFord fabricaFord = new FabricaFord();

        Carro carroFord = fabricaFord.fabricarCarro("Preto", 4, 1.6f, "flex");
        Carro carroFiat = fabricaFiat.fabricarCarro("Azul", 4, 2.0f, "flex");

        System.out.println("Carro: " + carroFord.getModelo() + " Cor: " + carroFord.getCor() + " Fabricante: " + carroFord.getFabricante());
        System.out.println("Carro: " + carroFiat.getModelo() + " Cor: " + carroFiat.getCor() + " Fabricante: " + carroFiat.getFabricante());

    }
}
