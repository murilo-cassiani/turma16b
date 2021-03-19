package uri;

import java.util.Scanner;

/**
 * Homework01
 */
public class Uri1004 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        System.out.println("PROD = " + (num1 * num2));

        entrada.close();
    }
}