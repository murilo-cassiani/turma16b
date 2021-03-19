package exemplos.exemplo04;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo carroMurilo = new Veiculo("Polo", "VW", 11.5);

        carroMurilo.exibeDados();

        double consumo = carroMurilo.getConsumo();
        System.out.println("Consumo do carro do Murilo é: " + consumo + " km/l");

        carroMurilo.setConsumo(12.0);
        double novoConsumo = carroMurilo.getConsumo();
        System.out.println("O novo consumo do carro do Murilo é: " + novoConsumo + " km/l");
    }
}
