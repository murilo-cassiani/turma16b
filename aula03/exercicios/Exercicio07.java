package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int NUM_TURMAS = 2, NUM_ALUNOS = 4;
        double somaTurma, somaGeral = 0;

        for (int turma = 1; turma <= NUM_TURMAS; turma++) {
            somaTurma = 0;
            System.out.printf("Notas da turma %d\n", turma);

            for (int aluno = 1; aluno <= NUM_ALUNOS; aluno++) {
                System.out.printf("Digite a nota do aluno %d: ", aluno);
                somaTurma += teclado.nextDouble();
            }
            
            somaGeral += somaTurma;
            System.out.printf("Média da turma %d: %.1f\n\n", turma, somaTurma / NUM_ALUNOS);
        }

        System.out.printf("Média geral das turmas: %.1f\n", somaGeral / (NUM_TURMAS * NUM_ALUNOS));

        teclado.close();
    }
}
