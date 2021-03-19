package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, pares = 0, somaPares = 0, porcentImpares;
        final int QTDE_NUMEROS = 10;

        for (int i = 1; i <= QTDE_NUMEROS; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num = teclado.nextInt();
            if (num % 2 == 0) {
                somaPares += num;
                pares++;
            }
        }

        porcentImpares = (int) ((1 - (double) pares / QTDE_NUMEROS ) * 100);

        System.out.printf("A média dos valores pares é: %.1f\n", ((double) somaPares / pares));
        System.out.printf("A porcentagem de números ímpares é: %d%%\n", porcentImpares);

        teclado.close();
    }
}
