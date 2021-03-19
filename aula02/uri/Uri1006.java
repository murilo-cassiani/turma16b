package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, mediaPonderada;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", mediaPonderada);

        entrada.close();
    }
}
