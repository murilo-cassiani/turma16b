package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(15, 53, 12);

        System.out.println("Que horas são? " + relogio.getHoraCompleta());

        relogio.setHora(44);
        relogio.setMinuto(61);
        relogio.setSegundo(2);

        System.out.println("Que horas são? " + relogio.getHoraCompleta());
    }
}
