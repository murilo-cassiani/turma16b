package exercicios.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Veiculo carroMurilo = new Veiculo("Polo", "VW", 11.5);

        carroMurilo.exibeDados();

        double consumo = carroMurilo.consumo();

        System.out.println("Consumo do carro do Murilo é: " + consumo + " km/l");
    }
}
