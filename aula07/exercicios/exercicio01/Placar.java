package exercicios.exercicio01;

public class Placar {
    String casa, visitante;
    int scoreCasa, scoreVisitante;

    public Placar() {
        this("Time da Casa", 0, "Visitante", 0);
    }

    public Placar(String timeCasa, String timeVisitante) {
        // casa = timeCasa;
        // visitante = timeVisitante;
        this(timeCasa, 0, timeVisitante, 0);
    }

    public Placar(String timeCasa, int scoreCasa, String timeVisitante, int scoreVisitante) {
        casa = timeCasa;
        this.scoreCasa = scoreCasa;
        visitante = timeVisitante;
        this.scoreVisitante = scoreVisitante;
    }

    public String exibePlacar() {
        return casa + " " + scoreCasa + " X " + scoreVisitante + " " + visitante;
    }
}
