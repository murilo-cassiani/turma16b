package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // declarações
        Scanner entrada = new Scanner(System.in);
        double custoFabrica, custoConsumidor, impostos, ganhosDistribuidor;

        // entrada
        System.out.println("Digite o custo de fábrica do carro:");
        custoFabrica = entrada.nextDouble();

        /* 
        processamentos
        1 - 45% de impostos sobre o custo de fábrica
        2 - 28% os ganhos do distribuidos sobre o custo de fábrica
        3 - custo final ao consumidor = custo de fábrica + impostos + ganhos do distribuidor
        */
        impostos = custoFabrica * 0.45;
        ganhosDistribuidor = custoFabrica * 0.28;
        custoConsumidor = custoFabrica + ganhosDistribuidor + impostos;

        // saídas
        System.out.println("O consumidor pagará: R$ " + custoConsumidor);
        System.out.println("Impostos a serem pagos: R$ " + impostos);

        entrada.close();
    }
}
