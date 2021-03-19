package exemplos.exemplo04;

public class Veiculo {
    private String modelo, marca;
    private double consumo;

    public Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        setConsumo(consumo);
    }

    public void exibeDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double novoConsumo) {
        if (novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }
}
