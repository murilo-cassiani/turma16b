package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, valorNota, qtdNotas;

        valor = entrada.nextInt();

        System.out.println(valor);
        valorNota = 100;
        qtdNotas = valor / valorNota;
        System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas, valorNota);
        valor = valor % valorNota;
        valorNota = 50;
        qtdNotas = valor / valorNota;
        System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas, valorNota);
        valor = valor % valorNota;
        valorNota = 20;
        qtdNotas = valor / valorNota;
        System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas, valorNota);
        valor = valor % valorNota;
        valorNota = 10;
        qtdNotas = valor / valorNota;
        System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas, valorNota);
        valor = valor % valorNota;
        valorNota = 5;
        qtdNotas = valor / valorNota;
        System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas, valorNota);
        valor = valor % valorNota;
        valorNota = 2;
        qtdNotas = valor / valorNota;
        System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas, valorNota);
        valor = valor % valorNota;
        valorNota = 1;
        qtdNotas = valor / valorNota;
        System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas, valorNota);

        entrada.close();
    }
}
