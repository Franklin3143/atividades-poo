package numbersDemo;

public class MetodosNumbersDemo {

    public NumbersDemo exibirDuasVezesNumero( int var) {

        NumbersDemo numbersDemo = new NumbersDemo();
        numbersDemo.setVar(var);
        return numbersDemo;
    }


    public NumbersDemo exibirNumeroMaisCinco (int var) {

        NumbersDemo numbersDemo = new NumbersDemo();
        numbersDemo.setVar(var);
        numbersDemo.setVar1(var + 5);
        return  numbersDemo;

    }

    public NumbersDemo exibirNumeroQuadrado(int var) {

        NumbersDemo numbersDemo = new NumbersDemo();
        numbersDemo.setVar(var);
        numbersDemo.setVar1((int) Math.pow(var, 2));
        return numbersDemo;
    }
}
