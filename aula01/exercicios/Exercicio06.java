package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        // declarações
        double km, pes, polegadas, jardas, milhas;
        Scanner entrada = new Scanner(System.in);

        // entrada - distância em km
        System.out.println("Digite a distância em km:");
        km = entrada.nextDouble();

        // processamento - cálculos encadeados km -> milhas -> jardas -> pés -> polegadas
        milhas = km * 0.62137;
        jardas = milhas * 1760;
        pes = jardas * 3;
        polegadas = pes * 12;

        // saída
        System.out.printf("Distância em:\nMilhas: %.2f\nJardas: %.2f\nPés: %.2f\nPolegadas: %.2f", milhas, jardas, pes, polegadas);

        // fechamento
        entrada.close();
    }
}
