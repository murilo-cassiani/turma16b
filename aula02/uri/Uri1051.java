package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, impostoDevido;

        salario = entrada.nextDouble();

        if (salario - 4500 > 0) {
            impostoDevido = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        } else {
            if (salario - 3000 > 0) {
                impostoDevido = (salario - 3000) * 0.18 + 1000 * 0.08;
            } else {
                if (salario - 2000 > 0) {
                    impostoDevido = (salario - 2000) * 0.08;
                } else {
                    impostoDevido = 0;
                }
            }
        }

        if (impostoDevido > 0) {
            System.out.printf("R$ %.2f\n", impostoDevido);
        } else {
            System.out.println("Isento");
        }

        entrada.close();
    }
}
