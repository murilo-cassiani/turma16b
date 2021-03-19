package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabuada;

        System.out.println("Entre com a tabuada desejada:");
        tabuada = teclado.nextInt();

        int mult = 0;

        while (mult <= 10) {
            System.out.printf("%d x %02d = %2d\n", tabuada, mult, tabuada * mult);
            mult++;
        }

        teclado.close();
    }
}
