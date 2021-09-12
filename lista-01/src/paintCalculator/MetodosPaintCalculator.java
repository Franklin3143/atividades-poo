package paintCalculator;

public class MetodosPaintCalculator {

    public PaintCalculator calculaAreaComodo(float largura, float altura) {
        PaintCalculator paintCalculator = new PaintCalculator();
        paintCalculator.setAltura(altura);
        paintCalculator.setLargura(largura);
        paintCalculator.setMetrosQuadrados(largura * altura);
        return paintCalculator;
    }

    public PaintCalculator calculaQuantidadeDeGaloes() {
        return null;
    }
}
