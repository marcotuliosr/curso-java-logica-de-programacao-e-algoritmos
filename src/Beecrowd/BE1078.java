/**
 * Created by marcotuliosr
 * Date : 9/3/2022}
 * Time : 1:31 AM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Scanner;

public class BE1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int produto = i * N;
            System.out.println(i + "x" + N + " = " + produto);
        }

        sc.close();
    }
}
