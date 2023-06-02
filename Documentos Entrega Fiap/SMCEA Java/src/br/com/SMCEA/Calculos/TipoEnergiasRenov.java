package br.com.SMCEA.Calculos;

import br.com.SMCEA.Fabrica.Fabrica;

public class TipoEnergiasRenov implements  Converter,CalculadoraPercentuaUsado {
    private String nmEnergia;
    private int idEnergia;
    private double gasto;
    private double multiplicador;
    private static double resultadoRenov;

//construtor
    public TipoEnergiasRenov(String nmEnergia, double gasto, double multiplicador) {
        this.nmEnergia = nmEnergia;
        this.gasto = gasto;
        this.multiplicador = multiplicador;
    }

    public void exibeFichaEnergia(){
        System.out.println(nmEnergia);
        System.out.println(gasto);
        System.out.println(multiplicador);
    }

    //getter
    public double getResultado() {
        return resultadoRenov;
    }

    @Override
    public double convertEnergiaRenovEmEletricidade() {
        this.resultadoRenov = this.gasto * this.multiplicador;
        return this.resultadoRenov;
    }


    }
