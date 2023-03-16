public class Desafio4 {

    //Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
    //
    //SP – R$67.836,43
    //RJ – R$36.678,66
    //MG – R$29.229,88
    //ES – R$27.165,48
    //Outros – R$19.849,53
    //
    //Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

    public static class FaturamentoDistribuidora {
        public static void main(String[] args) {
            double sp = 67836.43;
            double rj = 36678.66;
            double mg = 29229.88;
            double es = 27165.48;
            double outros = 19849.53;
            double total = sp + rj + mg + es + outros;

            double percSP = (sp / total) * 100;
            double percRJ = (rj / total) * 100;
            double percMG = (mg / total) * 100;
            double percES = (es / total) * 100;
            double percOutros = (outros / total) * 100;

            System.out.println("Percentual de representação por estado:");
            System.out.printf("SP: %.2f%%\n", percSP);
            System.out.printf("RJ: %.2f%%\n", percRJ);
            System.out.printf("MG: %.2f%%\n", percMG);
            System.out.printf("ES: %.2f%%\n", percES);
            System.out.printf("Outros: %.2f%%\n", percOutros);
        }
    }

}
