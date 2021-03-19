package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        if (num > 20) {
            System.out.println("Metade = " + ((double) num / 2));
        }

        entrada.close();
    }
}
