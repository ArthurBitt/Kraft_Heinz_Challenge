package br.com.SMCEA.Metas;

import br.com.SMCEA.Fabrica.ConsumoAgua;
import br.com.SMCEA.Fabrica.ConsumoEletricidade;
import br.com.SMCEA.Fabrica.Fabrica;

public class ValidaMetas extends Fabrica implements ConsumoEletricidade, ConsumoAgua {
    private boolean menos15PorcentTotalEnergia = true;
    private boolean menos20PorcentTotalAgua = true;
    private boolean maiorOuIgual51PorncentUsoEnergRenov = true;
    private Fabrica idFabrica;

    public ValidaMetas(int idFabrica, Fabrica idFabrica1) {
        super(idFabrica);
        this.idFabrica = idFabrica1;
    }

    public Boolean validaMeta1(){

        if(consumoTotalEletricidade < 15/100){
            System.out.println("Meta não batida");
            return menos15PorcentTotalEnergia = false;
        }else{
            System.out.println("Meta batida");
            return menos15PorcentTotalEnergia;
        }

        }

    public Boolean validaMeta2(){

        if(consumoTotalAgua < 20/100){
            System.out.println("Meta não batida");
            return menos20PorcentTotalAgua = false;
        }else {
            System.out.println("Meta batida");
            return menos20PorcentTotalAgua;
        }
    }

    public Boolean validaMeta3(){
        if (getConsumoTotalEnergRenov() < 51/100*consumoTotalEletricidade){
            System.out.println("Meta não batida");
            return maiorOuIgual51PorncentUsoEnergRenov = false;

        }else{
            System.out.println("Meta batida");
            return maiorOuIgual51PorncentUsoEnergRenov;

        }
    }
    }




