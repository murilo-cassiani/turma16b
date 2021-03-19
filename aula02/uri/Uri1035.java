package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        boolean testes;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        testes = b > c;
        testes = testes && d > a;
        testes = testes && (c + d) > (a + b);
        testes = testes && c > 0 && d > 0;
        testes = testes && a % 2 == 0;

        if (testes) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        in.close();
    }
}
