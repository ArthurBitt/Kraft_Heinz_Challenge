package br.com.SMCEA.Calculos;

public interface Converter {

    double idConversão = 0;
    double consumoEnergiaRenov = 0;
    double consumoEnergiaNaoRenov = 0;
    double multiplicador = 0;

    public default double convertEnergiaRenovEmEletricidade(){

        return consumoEnergiaRenov * multiplicador;
    }
    public default double convertEnergiaNaoRenovEmEletricidade(){

        return consumoEnergiaNaoRenov * multiplicador;
    }
}


