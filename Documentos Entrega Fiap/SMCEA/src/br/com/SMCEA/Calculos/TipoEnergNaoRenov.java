package br.com.SMCEA.Calculos;

import br.com.SMCEA.Fabrica.ConsumoEletricidade;

public class TipoEnergNaoRenov implements Converter, ConsumoEletricidade {
    private String nmEnergia;
    private int idEnergia;
    private double gasto;
    private double multiplicador;

    public double convertEnergiaRenovEmEletricidade(){

        double conversao = this.gasto*multiplicador;
        return conversao;
    }

    @Override
    public int getIdConversão() {
        return Converter.super.getIdConversão();
    }

    @Override
    public double setValorConsumoEletricidade(double valorEletricidade) {
        return 0;
    }

    @Override
    public double getConsumoTotalEletricidade() {
        return ConsumoEletricidade.super.getConsumoTotalEletricidade();
    }
}
