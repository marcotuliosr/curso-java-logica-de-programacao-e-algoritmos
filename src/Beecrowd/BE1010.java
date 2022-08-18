package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BE1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pec1, pec2, cod1, cod2;
        double preco1, preco2;

        cod1 = sc.nextInt();
        pec1 = sc.nextInt();
        preco1 = sc.nextDouble();
        sc.nextLine();
        cod2 = sc.nextInt();
        pec2 = sc.nextInt();
        preco2 = sc.nextDouble();
        sc.nextLine();

        double total = (pec1 * preco1) + (pec2 * preco2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}
