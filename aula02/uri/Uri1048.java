package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, reajuste, novoSalario;
        int percentual;

        salario = in.nextDouble();

        if (salario <= 2000) {
            if (salario <= 1200) {
                if (salario <= 800) {
                    if (salario <= 400) {
                        percentual = 15;
                    } else {
                        percentual = 12;
                    }
                } else {
                    percentual = 10;
                }
            } else {
                percentual = 7;
            }
        } else {
            percentual = 4;
        }
        /*
        Novo salario: 460.00
        Reajuste ganho: 60.00
        Em percentual: 15 %
        */
        reajuste = salario * percentual / 100;
        novoSalario = reajuste + salario;
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);

        in.close();
    }
}
