package porcentagem;

public class MetodosPorcentagem {

    public Porcentagem computarPorcentagem (double var, double var1) {

        Porcentagem porcentagem = new Porcentagem();
        porcentagem.setVar(var);
        porcentagem.setVar1(var1);
        porcentagem.setResultadoPorcentagem(var * 100 / var1 );
        porcentagem.setResultadoPorcentagemInversa(var1 * 100 / var);

        return porcentagem;
    }

    public Porcentagem1 computaPorcentagemDeValoresInseridos(double var, double var1) {
        Porcentagem1 porcentagem1 = new Porcentagem1();
        porcentagem1.setVar(var);
        porcentagem1.setVar1(var1);
        porcentagem1.setResultadoPorcentagem(var * 100 / var1 );
        porcentagem1.setResultadoPorcentagemInversa(var1 * 100 / var);

        return porcentagem1;
    }
}
