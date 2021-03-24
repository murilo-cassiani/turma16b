package exercicios.exerciciocontas;

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

    @Override
    public String toString() {
        return super.toString() + " limite: " + limite;
    }
}