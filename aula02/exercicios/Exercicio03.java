package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b;
        
        System.out.println("Digite os dois números:");
        a = in.nextDouble();
        b = in.nextDouble();

        System.out.println("Números em ordem não crescente:");
        if (a >= b) {
            System.out.printf("%f\n%f\n", a, b);
        } else {
            System.out.printf("%f\n%f\n", b, a);
        }

        in.close();
    }
}
