package exercicios.exerciciocontas;

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, numeroConta;
        double limite, valor;

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

            GerenciaContas contas = new GerenciaContas();

            switch (opcao) {
                case 1:   
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);

                    break;
                case 2:   
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da conta:");
                    limite = teclado.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);

                    break;
                case 3:   
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaPoupanca(numeroConta);

                    break;
                case 4:   
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do depósito:");
                    valor = teclado.nextDouble();

                    if (contas.depositar(numeroConta, valor)) {
                        System.out.println("Operação realizada.");
                    }  else {
                        System.out.println("Falha na operação!");
                    }

                    break;
                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do saque:");
                    valor = teclado.nextDouble();

                    if (contas.sacar(numeroConta, valor)) {
                        System.out.println("Operação realizada.");
                    }  else {
                        System.out.println("Falha na operação!");
                    }

                    break;
                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();

                    System.out.println(contas.consultarConta(numeroConta));

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
