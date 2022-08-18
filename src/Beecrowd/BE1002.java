package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BE1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;
        raio = sc.nextDouble();
        double n = 3.14159;
        area = raio * raio * n;
        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
