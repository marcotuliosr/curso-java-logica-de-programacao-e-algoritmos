package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double a;
        x = sc.next();
        y = sc.nextInt();
        a = sc.nextDouble();

//        System.out.println("Voce digitou: " + x);
////        System.out.println("Voce digitou: " + y);
////        System.out.println("Voce digitou: " + a);

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);


        sc.close();
    }
}
