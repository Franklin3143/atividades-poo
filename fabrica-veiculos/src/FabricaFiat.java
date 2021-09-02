public class FabricaFiat {


    public Carro fabricarCarro(String cor, int numeroPortas,
                               float cilindradas, String tipoCombustivel) {

        Motor motor = new Motor();
        motor.setCilindradas(cilindradas);
        motor.setTipoCombustivel(tipoCombustivel);

        Carro carro;
        carro = new Carro(motor);

        carro.setFabricante("Fiat");
        carro.setModelo("Uno");
        carro.setAno(2021);

        carro.setCor(cor);
        carro.setNumeroDePortas(numeroPortas);

        carro.setMotor(motor);

        return carro;

    }
}
