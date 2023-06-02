package br.com.SMCEA.Modulos;

import br.com.SMCEA.Fabrica.Fabrica;
import br.com.SMCEA.Metas.ValidaMetas;

public class TesteValidaMetas {
    public static void main(String[] args) {
        Fabrica fab1 = new Fabrica(01);

        fab1.setvalorConsumoAgua(200);
        fab1.setValorConsumoEletricidade(200);

        fab1.exibeFichaTecnica();

        ValidaMetas testMetas = new ValidaMetas(01,fab1);
        System.out.println(testMetas.validaMeta1());
    }
}
