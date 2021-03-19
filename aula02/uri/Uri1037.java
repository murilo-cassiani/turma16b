package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double num = in.nextDouble();

        if (num >= 0) {
            if (num > 25) {
                if (num > 50) {
                    if (num > 75) {
                        if (num > 100) {
                            System.out.println("Fora de intervalo");
                        } else {
                            System.out.println("Intervalo (75,100]");
                        }
                    } else {
                        System.out.println("Intervalo (50,75]");
                    }
                } else {
                    System.out.println("Intervalo (25,50]");
                }
            } else {
                System.out.println("Intervalo [0,25]");
            }
        } else {
            System.out.println("Fora de intervalo");
        }

        in.close();
    }
}
