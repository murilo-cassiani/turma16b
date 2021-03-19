package exercicios.exercicio03;

public class Veiculo {
    String modelo, marca;
    double consumo;

    Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    void exibeDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }

    double consumo() {
        return consumo;
    }
}
