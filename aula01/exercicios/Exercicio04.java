package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, custoQuilowatt, custoTotalQuilowatt, custoComDesconto;
        int quilowatt;

        // entradas
        System.out.println("Digite o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Digite quilowatt consumidos:");
        quilowatt = entrada.nextInt();

        /* 
        processamento
        1 - quilowatt de energia custa 1/500 avos do salário mínimo
        2 - valor a ser pago pela residência
        3 - valor a ser pago com desconto de 15%
        */
        custoQuilowatt = salarioMinimo / 500;
        custoTotalQuilowatt = custoQuilowatt * quilowatt;
        custoComDesconto = custoTotalQuilowatt * 0.85; // 15% de desconto

        // saídas
        System.out.println("Cada quilowatt custa: R$ " + custoQuilowatt);
        System.out.println("Esta residência deve pagar: R$ " + custoTotalQuilowatt);
        System.out.println("Valor a ser pago com desconto (- 15%): R$ " + custoComDesconto);

        entrada.close();    
    }
}
