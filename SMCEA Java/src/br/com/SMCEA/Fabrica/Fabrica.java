package br.com.SMCEA.Fabrica;

import br.com.SMCEA.Calculos.TipoEnergiasRenov;
import br.com.SMCEA.Calculos.TipoEnergiasNaoRenov;

public class Fabrica implements ConsumoEletricidade, ConsumoAgua {
    private int idFabrica;
    private double valorConsumoAgua;
    private double valorConsumoEletricidade;
    private TipoEnergiasRenov tipoEnergiasRenov;
    private TipoEnergiasNaoRenov tipoEnergiasNaoRenov;
    static int quantFabricas;

    public Fabrica(int idFabrica) {
        this.idFabrica = idFabrica;
        quantFabricas += 1;
    }

    public void exibeFichaTecnica() {
        System.out.println(String.format("""
                                            Fábrica: %d
                                            Consumo de Água: %.2f
                                            Consumo de Eletricidade: %.2f
                                            """, idFabrica, getValorConsumoAgua(), getValorConsumoEletricidade()));
    }

    // Getter & Setter
    public int getIdFabrica() {
        return idFabrica;
    }

    public double getValorConsumoAgua() {
        return valorConsumoAgua;
    }

    public double getValorConsumoEletricidade() {
        return valorConsumoEletricidade;
    }

    // Interface ConsumoEletricidade
    @Override
    public double setValorConsumoEletricidade(double valorEletricidade) {
        this.valorConsumoEletricidade = valorEletricidade;
        return this.valorConsumoEletricidade;
    }

    @Override
    public double getConsumoTotalEletricidade() {
        return ConsumoEletricidade.super.getConsumoTotalEletricidade();
    }

    // Interface ConsumoAgua

    public double setValorConsumoAgua(double valorAgua) {
        this.valorConsumoAgua = valorAgua;
        return this.valorConsumoAgua;
    }

    // Métodos para acessar a classe TipoEnergiasRenov
    public void setTipoEnergiasRenov(TipoEnergiasRenov tipoEnergiasRenov) {
        this.tipoEnergiasRenov = tipoEnergiasRenov;
    }

    public double getResultadoEnergiasRenov() {
        if (tipoEnergiasRenov != null) {
            return tipoEnergiasRenov.getResultado();
        }
        return 0.0;
    }

    public double convertEnergiaRenovEmEletricidade() {
        if (tipoEnergiasRenov != null) {
            return tipoEnergiasRenov.convertEnergiaRenovEmEletricidade();
        }
        return 0.0;
    }

    // Métodos para acessar a classe TipoEnergiasNaoRenov
    public void setTipoEnergiasNaoRenov(TipoEnergiasNaoRenov tipoEnergiasNaoRenov) {
        this.tipoEnergiasNaoRenov = tipoEnergiasNaoRenov;
    }

    public double getResultadoEnergiasNaoRenov() {
        if (tipoEnergiasNaoRenov != null) {
            return tipoEnergiasNaoRenov.getResultado();
        }
        return 0.0;
    }

    public double convertEnergiaNaoRenovEmEletricidade() {
        if (tipoEnergiasNaoRenov != null) {
            return tipoEnergiasNaoRenov.convertEnergiaNaoRenovEmEletricidade();
        }
        return 0.0;
    }

    @Override
    public double getConsumoTotalEnergRenov() {
        return getResultadoEnergiasRenov() + getResultadoEnergiasNaoRenov();
    }

    @Override
    public double setvalorConsumoAgua(double valorAgua) {
        return 0;
    }

    @Override
    public double getConsumoTotalAgua() {
        return ConsumoAgua.super.getConsumoTotalAgua();
    }
}
