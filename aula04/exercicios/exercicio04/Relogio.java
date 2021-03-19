package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }

    private int test0To59(int novoNum, int num) {
        if (novoNum >= 0 && novoNum < 60) {
            return novoNum;
        }

        return num;
    }

    public void setMinuto(int minuto) {
        this.minuto = test0To59(minuto, this.minuto);
    }

    public void setSegundo(int segundo) {
        this.segundo = test0To59(segundo, this.segundo);
    }

    public String getHoraCompleta() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
