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
        int X, Y;

            for (int i = 0; i < N; i++) {
                X = sc.nextInt();
                Y = sc.nextInt();
                if (Y == 0) System.out.println("divisao impossivel");
                else System.out.println((double) X / Y);
            }
        sc.close();
    }
}
