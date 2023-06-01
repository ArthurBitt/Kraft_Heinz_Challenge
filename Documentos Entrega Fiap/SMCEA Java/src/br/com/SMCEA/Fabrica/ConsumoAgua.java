package br.com.SMCEA.Fabrica;

public interface ConsumoAgua {
    double consumoTotalAgua = 0;
    //interface
    double setvalorConsumoAgua(double valorAgua);

    public default double getConsumoTotalAgua(){
        return consumoTotalAgua;
    }

}
