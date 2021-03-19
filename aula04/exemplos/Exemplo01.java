package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("Meu programa v 0.1");
        linha(); //chamada de método
        System.out.println("Menu");
        int z = 5;
        linha2(z);
        linha2(15);
        linha2(35);
        linha3(10, '*');
        linha3(15, '#');
        linha4("Bom dia!", '_');
        linha4("Como vai você, amigo?", '=');
    }

    static void linha() { // void significa sem, não tem 
        System.out.println("------------------");
    }

    static void linha2(int tamanho) { 
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int tamanho, char simbolo) { 
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    static void linha4(String texto, char simbolo) { 
        System.out.println(texto);
        for (int i = 0; i < texto.length(); i++) { // length = tamanho
            System.out.print(simbolo);
        }
        System.out.println();
    }



}