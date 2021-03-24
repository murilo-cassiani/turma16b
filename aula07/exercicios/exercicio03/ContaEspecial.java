package exercicios.exercicio03;

public class ContaEspecial extends Conta {
    double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() + limite >= valor) {
            return super.saque(valor);
        }
        return false;
    }
}