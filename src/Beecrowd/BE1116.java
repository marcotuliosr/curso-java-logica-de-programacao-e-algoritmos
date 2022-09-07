/**
 * Created by marcotuliosr
 * Date : 9/6/2022}
 * Time : 11:14 PM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Scanner;

public class BE1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X >= 0 ) {
                double media = (double) X / Y;
                System.out.println(media);
            } else {
                System.out.println("divisao impossivel");
            }
        }
        sc.close();
    }
}
