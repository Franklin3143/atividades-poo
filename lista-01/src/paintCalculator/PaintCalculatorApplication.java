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


        PaintCalculator calculoMetragem = metodosPaintCalculator.calculaAreaComodo(paintCalculator.getComprimento(),
                paintCalculator.getLargura(), paintCalculator.getAltura());

        System.out.println("O tamanho da sua área para pintura é de " + calculoMetragem.getMetrosQuadrados() + " m² ");

        System.out.println("A quantidade de galões utilizados serão de " + Math.ceil(calculoMetragem.getQuantidadeGaloes()) + " galões.");

        System.out.println("O valor gasto com os galões de tinta será de R$.: " +
                Math.round(calculoMetragem.getPrecoQuantidadeGaloes()) + ",00");

        System.out.println("----------------------------------------------------------------------------");

        System.out.println("O custo para pintar uma sala de " + calculoMetragem.getLargura() + " por " +
                calculoMetragem.getAltura() + " metros, com tetos de " + calculoMetragem.getComprimento() +
                " metros é de R$ " + Math.round(calculoMetragem.getPrecoQuantidadeGaloes()) + " reais =D ");


    }
}
