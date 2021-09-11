package numbersDemo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MetodosNumbersDemo metodosNumbersDemo = new MetodosNumbersDemo();

        NumbersDemo numbersDemo1 = metodosNumbersDemo.exibirDuasVezesNumero(12);
        NumbersDemo numbersDemo2 = metodosNumbersDemo.exibirDuasVezesNumero(16);
        NumbersDemo numbersDemoNumeroMaisCinco = metodosNumbersDemo.exibirNumeroMaisCinco(15);
        NumbersDemo numbersExibirNumeroQuadrado = metodosNumbersDemo.exibirNumeroQuadrado(9);

        System.out.println("Exibição do valor 1: " + numbersDemo1.getVar());
        System.out.println("Exibição do valor 2: " + numbersDemo2.getVar());

        System.out.println("Exibicao do valor: " + numbersDemoNumeroMaisCinco.getVar()+ " somando com + 5 = " + numbersDemoNumeroMaisCinco.getVar1());

        System.out.println("O valor referenciado foi: " + numbersExibirNumeroQuadrado.getVar() + ",  esse valor elevado ao quadrado é: " +
                numbersExibirNumeroQuadrado.getVar1());


        System.out.println("-------------------------------------------------------------------------");

        NumbersDemo2 numbersDemoRecebido = new NumbersDemo2();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        numbersDemoRecebido.setVar(leitura.nextInt());
        System.out.println("Digite o valor 2: ");
        numbersDemoRecebido.setVar1(leitura.nextInt());

        System.out.println("O primeiro número digitado: " + numbersDemoRecebido.getVar());
        System.out.println("O segundo número digitado: " + numbersDemoRecebido.getVar1());




    }

}
