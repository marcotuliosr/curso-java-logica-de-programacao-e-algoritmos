package EstruturaCondicional;

import java.util.Scanner;

public class Resolvido03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        if (A == B || A == C || B == C) {
            System.out.println("MENOR = " + A);
        } else {
            if (A < B && A < C) {
                System.out.println("MENOR = " + A);
            }
            if (B < A && B < C) {
                System.out.println("MENOR = " + B);
            }
            if (C < A && B > C) {
                System.out.println("MENOR = " + A);
            }
        }

        sc.close();
    }
}
