/**
 * Created by marcotuliosr
 * Date : 9/7/2022}
 * Time : 12:17 AM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package Beecrowd;

import java.util.Scanner;

public class BE1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= N; i++) {
            resultado *= i;
        }

        System.out.println(resultado);

        sc.close();
    }
}
