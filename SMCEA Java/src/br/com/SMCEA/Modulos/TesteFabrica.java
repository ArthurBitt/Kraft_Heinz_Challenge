package br.com.SMCEA.Modulos;

import br.com.SMCEA.Fabrica.Fabrica;

public class TesteFabrica {
    public static void main(String[] args) {
        Fabrica fab1 = new Fabrica(01);

        fab1.setvalorConsumoAgua(200);
        fab1.setValorConsumoEletricidade(200);

        fab1.exibeFichaTecnica();
    }
}
