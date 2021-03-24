package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    private static double taxaOperacao = 0.05; // atributo de classe

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public boolean saque(double valor) {
        double saqueComTaxa = valor + (valor * taxaOperacao);
        if (super.getSaldo() >= saqueComTaxa) {
            return super.saque(saqueComTaxa);
        }
        return false;
    }

    public static void setTaxaOperacao(double novaTaxa) {
        if (taxaOperacao > 0) {
            taxaOperacao = novaTaxa;
        }
    }

    @Override
    public String toString() {
        return "taxa: " + taxaOperacao;
    }
}