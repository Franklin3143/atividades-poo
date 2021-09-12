package paintCalculator;

import java.util.Scanner;

public class PaintCalculatorApplication {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        PaintCalculator paintCalculator = new PaintCalculator();
        MetodosPaintCalculator metodosPaintCalculator = new MetodosPaintCalculator();

        System.out.println("Digite a altura...:");
        paintCalculator.setAltura(leitura.nextFloat());
        System.out.println("Digite o comprimento...:");
        paintCalculator.setComprimento(leitura.nextFloat());
        System.out.println("Digite a largura...:");
        paintCalculator.setLargura(leitura.nextFloat());

        PaintCalculator calculoMetragem = metodosPaintCalculator.calculaAreaComodo(paintCalculator.getLargura(),
                paintCalculator.getAltura());

        System.out.println("O tamanho da sua área para pintura é de " + calculoMetragem.getMetrosQuadrados() + " m² ");


    }
}
