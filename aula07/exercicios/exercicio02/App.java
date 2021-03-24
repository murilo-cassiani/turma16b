package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Murilo", "99299-2008");
        Estudante e1 = new Estudante("Camila", "3893-5962", "biologia");
        Professor prof1 = new Professor("Flávio", "99887-8520", 2500.0);

        System.out.println(p1);
        System.out.println(e1);
        System.out.println(prof1);
    }
}
