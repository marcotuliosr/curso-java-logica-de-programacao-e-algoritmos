/**
 * Created by marcotuliosr
 * Date : 9/6/2022}
 * Time : 11:55 PM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Scanner;

public class BE1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int total = 0;

        if (X > Y) {
            for (int i = Y; i <= X; i++) {
                if (i % 13 != 0)
                    total = total + i;
            }
        } else {
            for (int i = X; i <= Y; i++) {
                if (i % 13 != 0)
                    total = total + i;
            }

            System.out.println(total);
            sc.close();
        }
    }
}