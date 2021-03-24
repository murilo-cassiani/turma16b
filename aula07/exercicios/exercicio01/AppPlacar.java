package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar jogoSemTimes = new Placar();
        Placar jogoSaoCor = new Placar("São Paulo", "Corinthians");
        Placar jogoPalSan = new Placar("Palmeiras", 1, "Santos", 0);

        System.out.println(jogoSemTimes.exibePlacar());
        System.out.println(jogoSaoCor.exibePlacar());
        System.out.println(jogoPalSan.exibePlacar());
    }
}
