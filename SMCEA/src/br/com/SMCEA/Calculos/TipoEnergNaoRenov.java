package br.com.SMCEA.Calculos;

import br.com.SMCEA.Calculos.Converte;

public class TipoEnergNaoRenov extends Converte {
    private String nmEnergia;
    private int idEnergia;
    private double gasto;
    private double multiplicador;

    public double convertEnergiaRenovEmEletricidade(){

        double conversao = this.gasto*multiplicador;
        return conversao;
    }

}
