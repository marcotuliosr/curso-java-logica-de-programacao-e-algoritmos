/**
 * Created by marcotuliosr
 * Date : 9/4/2022}
 * Time : 1:32 PM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Scanner;

public class BE1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) in++;
            else out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
