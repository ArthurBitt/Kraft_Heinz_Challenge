package br.com.SMCEA.Metas;

import br.com.SMCEA.Fabrica.ConsumoAgua;
import br.com.SMCEA.Fabrica.ConsumoEletricidade;
import br.com.SMCEA.Fabrica.Fabrica;
import br.com.SMCEA.Calculos.TipoEnergiasRenov;
import br.com.SMCEA.Calculos.TipoEnergiasNaoRenov;

public class ValidaMetas extends Fabrica implements ConsumoEletricidade, ConsumoAgua {
    private boolean menos15PorcentTotalEnergia = true;
    private boolean menos20PorcentTotalAgua = true;
    private boolean maiorOuIgual51PorcentUsoEnergRenov = true;
    private Fabrica idFabrica;

    public ValidaMetas(int idFabrica, Fabrica idFabrica1) {
        super(idFabrica);
        this.idFabrica = idFabrica1;
    }

    public Boolean validaMeta1() {
        double consumoTotalEletricidade = getValorConsumoEletricidade();

        if (consumoTotalEletricidade < 0.15 * getResultadoEnergiasRenov() + getResultadoEnergiasNaoRenov()) {
            System.out.println("Meta não batida");
            return menos15PorcentTotalEnergia = false;
        } else {
            System.out.println("Meta batida");
            return menos15PorcentTotalEnergia;
        }
    }

    public Boolean validaMeta2() {
        double consumoTotalAgua = getValorConsumoAgua();

        if (consumoTotalAgua < 0.20 * consumoTotalAgua) {
            System.out.println("Meta não batida");
            return menos20PorcentTotalAgua = false;
        } else {
            System.out.println("Meta batida");
            return menos20PorcentTotalAgua;
        }
    }

    public Boolean validaMeta3() {
        double consumoTotalEletricidade = getValorConsumoEletricidade();
        double consumoTotalEnergRenov = getConsumoTotalEnergRenov();

        if (consumoTotalEnergRenov < 0.51 * consumoTotalEletricidade) {
            System.out.println("Meta não batida");
            return maiorOuIgual51PorcentUsoEnergRenov = false;
        } else {
            System.out.println("Meta batida");
            return maiorOuIgual51PorcentUsoEnergRenov;
        }
    }
}
