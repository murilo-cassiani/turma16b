package exercicios.exercicio03;

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, numeroConta;
        ContaCorrente cc;
        ContaEspecial ce;
        ContaPoupanca cp;
        double limite;
        double taxa;

        do {
            System.out.println("1 - nova conta corrente");
            System.out.println("2 - nova conta especial");
            System.out.println("3 - nova conta poupança");
            System.out.println("4 - depósito");
            System.out.println("5 - saque");
            System.out.println("6 - consultar saldo");
            System.out.println("7 - sair");
            System.out.print("Opção ==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:   
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);

                    break;
                case 2:   
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da conta:");
                    limite = teclado.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);

                    break;
                case 3:   
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cp = new ContaPoupanca(numeroConta);

                    break;
                case 4:   
                    break;
                case 5:   
                    break;
                case 6:   
                    break;
                case 7:   
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 7);

        teclado.close();
    }
}
