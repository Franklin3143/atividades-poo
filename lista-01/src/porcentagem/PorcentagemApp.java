package porcentagem;

import java.util.Scanner;

public class PorcentagemApp {

    public static void main(String[] args) {

        MetodosPorcentagem metodosPorcentagem = new MetodosPorcentagem();

        Porcentagem porcentagem = metodosPorcentagem.computarPorcentagem(2.0, 5.0);

        System.out.println("O valor do primeiro número é: " + porcentagem.getVar());
        System.out.println("O valor do segundo número é: " + porcentagem.getVar1());

        System.out.println("A porcentagem de: " + porcentagem.getVar() +
                " é: " + porcentagem.getResultadoPorcentagem() + " %");

        System.out.println("A porcentagem de: " + porcentagem.getVar1() +
                " é: " + porcentagem.getResultadoPorcentagemInversa() + " %");


        System.out.println("------------------------------------------------------------------");
        System.out.println("Valores digitados pelo usuário");
        System.out.println("------------------------------------------------------------------");

        Porcentagem1 porcentagem1 = new Porcentagem1();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        porcentagem1.setVar(leitura.nextFloat());
        System.out.println("Insira o segundo valor: ");
        porcentagem1.setVar1(leitura.nextFloat());

       metodosPorcentagem.computaPorcentagemDeValoresInseridos(porcentagem1.getVar(),
                porcentagem1.getVar1());

        System.out.println("A porcentagem de: " + porcentagem1.getVar() + " é: " +
                porcentagem1.getResultadoPorcentagem());

        System.out.println("A porcentagem de: " + porcentagem1.getVar1() + " é: " +
                porcentagem1.getResultadoPorcentagemInversa());



    }
}
