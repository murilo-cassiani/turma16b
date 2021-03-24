package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 0;
    }

    public Funcionario() {}

    public String exibir() {
        return nome + " : " + salario;
    }

    public void aumento(double percentAumento) {
        if (percentAumento > 0)
            salario *= (1 + (percentAumento / 100));
    }

    @Override
    public String toString() {
        return nome + " : " + salario;
    }
}