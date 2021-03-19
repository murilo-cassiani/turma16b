package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // declaração
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        // entrada
        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = entrada.nextDouble();
        
        // processamento
        media = (nota1 + nota2) / 2;

        //saída
        System.out.println("A média do aluno é " + media);

        // fechamento
        entrada.close();
    }
}