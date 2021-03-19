package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        String tipo;

        System.out.println("Entre com os comprimentos de lados do triângulo");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if ((a > b + c) || (b > a + c) || (c > a + b)) {
            tipo = "inválido";            
        } else {
            if ((a == b) || (b == c) || (c == a)) {
                if ((a == b) && (b == c)) {
                    tipo = "equilátero";
                } else {
                    tipo = "isósceles";
                }
            } else {
                tipo = "escaleno";
            }
        }

        System.out.printf("Este é um triângulo: %s", tipo);

        in.close();
    }
}
