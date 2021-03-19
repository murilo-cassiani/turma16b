package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 1, i = 1, soma = 0;

        while (num != 0) {
            System.out.printf("Digite o %dº número: ", i);
            num = teclado.nextInt();
            soma += num;
            i++;
        }

        System.out.println("A soma dos valores é: " + soma);

        teclado.close();
    }
}
