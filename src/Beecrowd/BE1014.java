package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BE1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x;
        double y, consumo;
        x = sc.nextInt();
        y = sc.nextDouble();

        consumo = x / y;
        System.out.printf("%.3f km/l%n", consumo);

        sc.close();

    }
}
