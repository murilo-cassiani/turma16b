package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numeroFuncionarios;

    public Gerente(String nome, double salario, int funcionarios) {
        super(nome, salario); // chamada ao construtor de Funcionario
        numeroFuncionarios = funcionarios;
    }

    @Override
    public String exibir() {
        return super.exibir() + " - " + numeroFuncionarios;
    }

    @Override
    public void aumento(double percentAumento) {
        super.aumento(percentAumento + 20);
    }
}
