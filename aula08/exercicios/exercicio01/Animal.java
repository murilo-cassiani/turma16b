package exercicios.exercicio01;

public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietario prop;

    public Animal(String nome, String raca, int anoNascimento) {
        prop = new Proprietario();
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
    }

    public Animal(String nome, String raca, int anoNascimento, Proprietario prop) {
        this(nome, raca, anoNascimento);
        setProp(prop);
    }

    public void setProp(Proprietario prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Raça: " + raca + " - Nascimento: " + anoNascimento + "\nDados do Proprietário - " + prop.toString();
    }
}
