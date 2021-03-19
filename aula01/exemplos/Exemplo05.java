package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        double valor = 345.985;
        int numero = 34;

        System.out.println(valor);
        // System.out.printf(FORMATO, VARIÁVEIS);
        // %d - int %f - double %s - String
        System.out.printf("%f\n", valor);
        System.out.printf("%.2f\n", valor); // .2 - 2 casas decimais

        System.out.printf("int = %d, double = %f\n", numero, valor);
    }
}
