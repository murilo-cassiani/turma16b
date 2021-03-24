package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Animal pipo = new Animal("Pipo", "SRD", 2012);

        Proprietario p1 = new Proprietario("João", "11 99478-7898");
        Animal meg = new Animal("Meg", "Siamês", 2018, p1);

        System.out.println(pipo);
        System.out.println(meg);

        pipo.setProp(p1);
        System.out.println(pipo);
    }
}
