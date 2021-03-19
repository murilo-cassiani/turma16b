package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, positivos = 0, pares = 0, zeros = 0;
        final int NUM_LIDOS = 5;

        for (int i = 0; i < NUM_LIDOS; i++) {
            valor = teclado.nextInt();
            if (valor > 0) {
                positivos++;
            } else {
                if (valor == 0) {
                    zeros++;
                }
            }
            if (valor % 2 == 0) {
                pares++;
            }
        }

        /*
        3 valor(es) par(es)
        2 valor(es) impar(es)
        1 valor(es) positivo(s)
        3 valor(es) negativo(s)
        */

        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", NUM_LIDOS - pares);
        System.out.printf("%d valor(es) positivo(s)\n", positivos);
        System.out.printf("%d valor(es) negativo(s)\n", NUM_LIDOS - positivos - zeros);

        teclado.close();
    }
}
