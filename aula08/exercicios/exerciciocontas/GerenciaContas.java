package exercicios.exerciciocontas;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> hashContas;

    public GerenciaContas() {
        hashContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        hashContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        hashContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        hashContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta conta = hashContas.get(numeroConta);
        if(conta != null) {
            if (conta.deposito(valor)) {
                return true;
            }
        }

        return false;
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta conta = hashContas.get(numeroConta);
        if(conta != null) {
            if (conta.saque(valor)) {
                return true;
            }
        }

        return false;
    }

    public String consultarConta(int numeroConta) {
        Conta conta = hashContas.get(numeroConta);
        if (conta != null) {
            return conta.toString();
        }

        return "Conta não encontrada";
    }
}
