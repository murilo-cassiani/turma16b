package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, parcela;

        System.out.println("Digite o salário do funcionário:");
        salario = in.nextDouble();
        System.out.println("Digite o valor da parcela do empréstimo:");
        parcela = in.nextDouble();

        if (parcela <= salario * 0.3) {
            System.out.println("Empréstimo pode ser concedido");
        }
        else {
            System.out.println("Empréstimo NÃO pode ser concedido");
        }

        in.close();
    }
}
