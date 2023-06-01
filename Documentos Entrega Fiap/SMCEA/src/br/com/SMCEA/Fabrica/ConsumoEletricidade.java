package br.com.SMCEA.Fabrica;

public interface ConsumoEletricidade {
    double consumoTotalEletricidade = 0;
    double consumoTotalEnergRenov = 0;

    //interface
    double setValorConsumoEletricidade(double valorEletricidade);

    public default double getConsumoTotalEletricidade(){
        return consumoTotalEletricidade;
    }

public default double getConsumoTotalEnergRenov(){
        double resultadoconsumoTotalEnergRenov = consumoTotalEnergRenov/ consumoTotalEletricidade;
        return resultadoconsumoTotalEnergRenov;
}

}
