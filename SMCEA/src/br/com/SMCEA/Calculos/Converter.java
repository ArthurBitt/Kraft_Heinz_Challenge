package br.com.SMCEA.Calculos;

public interface Converter {

    int idConversão = 0;

    public default double convertEnergiaRenovEmEletricidade(){

        return 0;
    }

    public default int getIdConversão() {

        return idConversão;
    }


}


