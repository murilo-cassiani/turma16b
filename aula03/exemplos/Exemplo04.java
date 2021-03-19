package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        /*
        System.out.println("Digite um valor positivo:");
        valor = teclado.nextInt();

        // ou forçar valor = -1;

        while (valor <= 0) {
            System.out.println("Digite um valor positivo:");
            valor = teclado.nextInt();
        }
        */
        
        do {
            System.out.println("Digite um valor positivo:");
            valor = teclado.nextInt();
        } while (valor <= 0);

        teclado.close();
    }
}
