package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario;
        String desconto;

        System.out.println("Digite o salário:");
        salario = in.nextDouble();

        if (salario > 2000) {
            desconto = "30%";
        } else {
            if (salario > 1200) {
                desconto = "25%";
            } else {
                if (salario > 600) {
                    desconto = "20%";
                } else {
                    desconto = "isento";
                }
            }
        }

        System.out.printf("Desconto do INSS: %s", desconto);

        in.close();
    }
}
