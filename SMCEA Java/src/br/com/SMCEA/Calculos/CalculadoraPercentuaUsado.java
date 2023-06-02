package br.com.SMCEA.Calculos;

public interface CalculadoraPercentuaUsado {
    double resultPercentuaEnergia = 0;

    //getter & setter
    public default double calculaPercentualUsado(){
        return resultPercentuaEnergia;
    }


    public default double getResultPercentuaEnergia() {
        return resultPercentuaEnergia;
    }
}
