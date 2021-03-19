package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaNotas = 0.0, nota;
        int numNotas = 0;
        final int NOTAS_VALIDAS = 2;

        while (numNotas < NOTAS_VALIDAS) {
            nota = teclado.nextDouble();
            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                numNotas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        System.out.printf("media = %.2f\n", somaNotas / NOTAS_VALIDAS);
        
        teclado.close();
    }
}
