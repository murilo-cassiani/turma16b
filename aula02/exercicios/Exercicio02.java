package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, mediaPonderada;
        
        System.out.println("Entre com as duas notas do aluno:");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        mediaPonderada = nota1 * 0.4 + nota2 * 0.6;

        if (mediaPonderada >= 6.0) {
            System.out.print("Aprovado");
        } else {
            System.out.print("Reprovado");
        }

        System.out.printf(" com média %.1f\n", mediaPonderada);

        entrada.close();
    }
}
