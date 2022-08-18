package Beecrowd;

import java.util.Scanner;

public class BE1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prod1, prod2, PROD;
        prod1 = sc.nextInt();
        prod2 = sc.nextInt();

        PROD = prod1 * prod2;
        System.out.println("PROD = " + PROD);

        sc.close();
    }
}
