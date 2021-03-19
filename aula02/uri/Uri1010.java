package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peca1Valor, peca2Valor, valorTotal;
        int peca1Qtd, peca2Qtd;

        entrada.nextInt(); // leitura do código da peça 1
        peca1Qtd = entrada.nextInt();
        peca1Valor = entrada.nextDouble();

        entrada.nextInt(); // leitura do código da peça 2
        peca2Qtd = entrada.nextInt();
        peca2Valor = entrada.nextDouble();

        valorTotal = peca1Qtd * peca1Valor + peca2Qtd * peca2Valor;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        entrada.close();
    }
}
