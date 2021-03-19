package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Entre com o número:");
        num = teclado.nextInt();
        
        int numSeq = 1;

        while (numSeq * 2 <= num) {
            System.out.printf("%d, ", numSeq);
            numSeq *= 2;
        }

        System.out.printf("%d", numSeq);

        teclado.close();
    }
}
