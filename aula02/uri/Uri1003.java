package uri;

import java.util.Scanner;

/**
 * Homework02
 */
public class Uri1003 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = entrada.nextInt() + entrada.nextInt();

        System.out.println("SOMA = " + soma);

        entrada.close();
    }
}