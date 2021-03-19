package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioAtual, salarioNovo;

        System.out.println("Digite o salário atual do funcionário:");
        salarioAtual = entrada.nextDouble();

        salarioNovo = salarioAtual * 1.25;

        System.out.println("Novo salário (+ 25%): R$ " + salarioNovo);

        entrada.close();
    }
}
