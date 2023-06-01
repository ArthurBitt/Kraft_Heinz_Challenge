package br.com.SMCEA.Fabrica;

public class Fabrica implements ConsumoEletricidade, ConsumoAgua {
    private int idFabrica;
    private double valorConsumoAgua;
    private double valorConsumoEletricidade;
    static int quantFabricas;


    public Fabrica(int idFabrica) {
        this.idFabrica = idFabrica;
        quantFabricas +=1;
    }

    public void exibeFichaTecnica(){
        System.out.println(String.format(""" 
                                            Fábrica: %d
                                            Consumo de Água: %.2f
                                            Consumo de Eletricidade: %.2f
                                            """, idFabrica, getValorConsumoAgua(),getValorConsumoEletricidade()));
    }

    //getter & setter
    public int getIdFabrica() {
        return idFabrica;
    }

    public double getValorConsumoAgua() {
        return valorConsumoAgua;
    }

    public double getValorConsumoEletricidade() {
        return valorConsumoEletricidade;
    }

    //interface
    @Override
    public double setvalorConsumoAgua(double valorAgua) {
        this.valorConsumoAgua = valorAgua;
        return this.valorConsumoAgua;
    }

    @Override
    public double setValorConsumoEletricidade(double valorEletricidade) {
        this.valorConsumoEletricidade = valorEletricidade;
        return this.valorConsumoEletricidade;
    }

    @Override
    public double getConsumoTotalEnergRenov() {
        return consumoTotalEletricidade;
    }
}

