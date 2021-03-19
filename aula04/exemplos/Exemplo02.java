package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int resultado;

        resultado = soma(10, 5);
        System.out.println(resultado);
    }

    static int soma(int a, int b) {
        int resposta;

        resposta = a + b;

        return resposta;
    }

}