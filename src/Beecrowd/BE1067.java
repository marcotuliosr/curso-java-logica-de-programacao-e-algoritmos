/**
 * Created by marcotuliosr
 * Date : 9/4/2022}
 * Time : 1:06 PM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Scanner;

public class BE1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X >= 1 && X <= 1000) {
            for (int i = 1; i <= X; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    sc.close();
                }
            }
        }
    }
}