package exercicios.exercicio01;

public class Proprietario {
    String nome, telefone;

    public Proprietario() {}

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Telefone: " + telefone + "\n";
    }
}
