import br.com.SMCEA.Calculos.TipoEnergiasRenov;
import br.com.SMCEA.Calculos.TipoEnergiasNaoRenov;
import br.com.SMCEA.Fabrica.Fabrica;
import br.com.SMCEA.Metas.ValidaMetas;

public class Main_SMCEA {
    public static void main(String[] args) {
        // Criando uma instância da classe Fabrica
        Fabrica fabrica1 = new Fabrica(1);

        // Configurando o consumo de água e eletricidade da fábrica
        fabrica1.setValorConsumoAgua(100.5);
        fabrica1.setValorConsumoEletricidade(500.7);

        // Exibindo a ficha técnica da fábrica
        System.out.println("Ficha Técnica da Fábrica:");
        fabrica1.exibeFichaTecnica();

        // Criando instâncias das classes TipoEnergiasRenov e TipoEnergiasNaoRenov
        TipoEnergiasRenov energiaRenovavel = new TipoEnergiasRenov("Energia Renovável", 50.2, 0.8);
        TipoEnergiasNaoRenov energiaNaoRenovavel = new TipoEnergiasNaoRenov("Energia Não Renovável", 80.5, 0.6);

        // Configurando as instâncias das classes TipoEnergiasRenov e TipoEnergiasNaoRenov na fábrica
        fabrica1.setTipoEnergiasRenov(energiaRenovavel);
        fabrica1.setTipoEnergiasNaoRenov(energiaNaoRenovavel);

        // Exibindo as informações das energias renováveis e não renováveis
        System.out.println("\nInformações das Energias Renováveis:");
        energiaRenovavel.exibeFichaEnergia();
        System.out.println("\nInformações das Energias Não Renováveis:");
        energiaNaoRenovavel.exibeFichaEnergia();

        // Convertendo as energias renováveis e não renováveis em eletricidade
        double eletricidadeRenovavel = fabrica1.convertEnergiaRenovEmEletricidade();
        double eletricidadeNaoRenovavel = fabrica1.convertEnergiaNaoRenovEmEletricidade();

        // Exibindo o resultado da conversão em eletricidade
        System.out.printf("\nEletricidade a partir de energia renovável: %.2f kWh\n", eletricidadeRenovavel);
        System.out.printf("Eletricidade a partir de energia não renovável: %.2f kWh\n", eletricidadeNaoRenovavel);

        // Criando uma instância da classe ValidaMetas
        ValidaMetas validador = new ValidaMetas(1, fabrica1);

        // Validando as metas
        boolean meta1Batida = validador.validaMeta1();
        boolean meta2Batida = validador.validaMeta2();
        boolean meta3Batida = validador.validaMeta3();

        // Exibindo o resultado da validação das metas
        System.out.println("\nResultado da Validação das Metas:");
        System.out.println("Meta 1 (Consumo de Eletricidade < 15%): " + (meta1Batida ? "Batida" : "Não Batida"));
        System.out.println("Meta 2 (Consumo de Água < 20%): " + (meta2Batida ? "Batida" : "Não Batida"));
        System.out.println("Meta 3 (Uso de Energia Renovável >= 51% do Consumo de Eletricidade): " + (meta3Batida ? "Batida" : "Não Batida"));
    }
}
