package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();

        lista.add(1.1);
        lista.add(1.2);
        lista.add(1.3);
        lista.add(1.4);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            if (lista.get(i) == 1.3) {
                System.out.println("Achei o valor " + lista.get(i) + " na posição " + i);
                System.err.println("Removendo...");
                lista.remove(i);
            }
        }

        for (Double numero : lista) {
            System.out.println(numero);
        }

        System.out.println(lista);
    }
}
