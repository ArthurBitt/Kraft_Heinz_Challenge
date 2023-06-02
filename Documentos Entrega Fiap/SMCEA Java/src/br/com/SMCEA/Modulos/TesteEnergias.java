package br.com.SMCEA.Modulos;

import br.com.SMCEA.Calculos.TipoEnergiasNaoRenov;
import br.com.SMCEA.Calculos.TipoEnergiasRenov;

public class TesteEnergias {
    public static void main(String[] args) {
        TipoEnergiasRenov enrRenov1 = new TipoEnergiasRenov("eolica", 300, 0.13);
        enrRenov1.convertEnergiaNaoRenovEmEletricidade();
        enrRenov1.exibeFichaEnergia();
        enrRenov1.convertEnergiaRenovEmEletricidade();
        System.out.println(enrRenov1.getResultado());


        TipoEnergiasNaoRenov enrgNaoRenov1 = new TipoEnergiasNaoRenov("termoeletrica", 300, 0.13);

        enrgNaoRenov1.exibeFichaEnergia();
        enrgNaoRenov1.convertEnergiaNaoRenovEmEletricidade();
        System.out.println(enrgNaoRenov1.getResultado());


    }
}


