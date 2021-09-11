package numbersDemo;

public class MetodosNumberDemoRecebido {

    NumbersDemo2 numbersDemo2 = new NumbersDemo2();

    public NumbersDemo2 exibirDuasVezesNumero( int var) {

        numbersDemo2.setVar(var);
        return numbersDemo2;
    }


    public NumbersDemo2 exibirNumeroMaisCinco (int var) {
        numbersDemo2.setVar(var);
        numbersDemo2.setVar1(var + 5);
        return  numbersDemo2;

    }

    public NumbersDemo2 exibirNumeroQuadrado(int var) {
        numbersDemo2.setVar(var);
        numbersDemo2.setVar1((int) Math.pow(var, 2));
        return numbersDemo2;
    }
}
