/**
 * Created by marcotuliosr
 * Date : 9/7/2022}
 * Time : 12:48 AM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Scanner;

public class BE1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++)
            if (N % i == 0)
                System.out.println(i);
        sc.close();
    }
}
