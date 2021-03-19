package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean senhaIncorreta;
        int senhaCorreta = 2002, senhaLida;

        do {
            senhaLida = teclado.nextInt();
            senhaIncorreta = senhaLida != senhaCorreta;
            if (senhaIncorreta) {
                System.out.println("Senha Invalida");
            }
        } while (senhaIncorreta);

        System.out.println("Acesso Permitido");

        teclado.close();
    }
}
