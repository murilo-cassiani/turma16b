package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = teclado.nextInt();

        if (ehPar(numero)) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado não é par");
        }

        teclado.close();
    }

    static boolean ehPar(int num) {
        /*
        if (num % 2 == 0) {
            return true;
        }

        return false;
        */
        return (num % 2 == 0);
    }
}
