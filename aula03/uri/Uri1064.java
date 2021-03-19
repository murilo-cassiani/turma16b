package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor, somaPos = 0.0;
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            valor = teclado.nextDouble();
            if (valor > 0) {
                positivos++;
                somaPos += valor;
            }
        }

        System.out.printf("%d valores positivos\n", positivos);
        System.out.printf("%.1f\n", somaPos / positivos);

        teclado.close();
    }
}
