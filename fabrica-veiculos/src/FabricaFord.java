public class FabricaFord {

    public Carro fabricarCarro(String cor, int numeroDePortas,
                               float cilindradas, String tipoDeCombustivel) {

        Motor motor = new Motor();
        motor.setCilindradas(cilindradas);
        motor.setTipoCombustivel(tipoDeCombustivel);

        Carro carro;
        carro = new Carro(motor);

        carro.setFabricante("Ford");
        carro.setModelo("Fusion");
        carro.setAno(2020);

        carro.setCor(cor);
        carro.setNumeroDePortas(numeroDePortas);


        carro.setMotor(motor);

        return carro;
    }
}
