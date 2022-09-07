/**
 * Created by marcotuliosr
 * Date : 9/5/2022}
 * Time : 12:43 AM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BE1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();

            double media = (A * 2 + B * 3 + C * 5) / 10;
            System.out.printf("%.1f%n", media);

        }

        sc.close();
    }
}
