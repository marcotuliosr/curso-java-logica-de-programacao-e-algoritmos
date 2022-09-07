/**
 * Created by marcotuliosr
 * Date : 9/5/2022}
 * Time : 12:04 AM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Scanner;

public class BE1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();

            if (X == 0) {
                System.out.printf("NULL %n", N);
            } else {
                if (X % 2 == 0) {
                    System.out.printf("EVEN ", X);
                } else {
                    System.out.print("ODD ");
                }
                if (X > 0) {
                    System.out.printf("POSITIVE%n", X);
                } else {
                    System.out.printf("NEGATIVE%n", X);
                }
            }
        }
        sc.close();
    }
}
