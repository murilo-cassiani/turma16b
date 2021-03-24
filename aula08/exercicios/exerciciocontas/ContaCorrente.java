package exercicios.exerciciocontas;

public class ContaCorrente extends Conta {
    final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() >= valor) {
            return super.saque(valor);
        }
        return false;
    }

    @Override
    public boolean deposito(double valor) {
        if (valor > TAXA_DEPOSITO) {
            return super.deposito(valor - TAXA_DEPOSITO);
        }
        return false;
    }
}