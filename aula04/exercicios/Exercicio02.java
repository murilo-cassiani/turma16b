package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("O menor número é o " + menor3(10, -50, 120));
    }

    static int menor3(int menor, int n2, int n3) {

        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        return menor;
    }
}
