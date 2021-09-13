package paintCalculator;

public class MetodosPaintCalculator {

    PaintCalculator paintCalculator = new PaintCalculator();

    public PaintCalculator calculaAreaComodo(float largura, float altura, float comprimento) {
        paintCalculator.setComprimento(comprimento);
        paintCalculator.setAltura(altura);
        paintCalculator.setLargura(largura);
        paintCalculator.setMetrosQuadrados(comprimento * largura * altura);
        calculaQuantidadeDeGaloes(paintCalculator);
        return paintCalculator;
    }

    public void calculaQuantidadeDeGaloes(PaintCalculator paintCalculator ) {
        paintCalculator.setQuantidadeGaloes(paintCalculator.getMetrosQuadrados() / 106);
        paintCalculator.setPrecoQuantidadeGaloes(paintCalculator.getQuantidadeGaloes() * 32);

    }
}
