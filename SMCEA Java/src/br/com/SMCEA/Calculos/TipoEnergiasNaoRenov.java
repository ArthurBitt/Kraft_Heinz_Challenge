package br.com.SMCEA.Calculos;

public class TipoEnergiasNaoRenov  implements Converter, CalculadoraPercentuaUsado {
    private String nmEnergia;
    private int idEnergia;
    private double gasto;
    private double multiplicador;
    private static double resultadoNaoRenov;

    //construtor
    public TipoEnergiasNaoRenov(String nmEnergia, double gasto, double multiplicador) {
        super();
        this.nmEnergia = nmEnergia;
        this.gasto = gasto;
        this.multiplicador = multiplicador;
    }

    public void exibeFichaEnergia(){
        System.out.println(nmEnergia);
        System.out.println(gasto);
        System.out.println(multiplicador);
    }

    // getter
    public double getResultado() {
        return resultadoNaoRenov;
    }

    @Override
    public double convertEnergiaNaoRenovEmEletricidade() {
        this.resultadoNaoRenov = this.gasto * this.multiplicador;
        return this.resultadoNaoRenov;
    }


}
