/**
 * Created by marcotuliosr
 * Date : 9/4/2022}
 * Time : 12:54 PM
 * Project Name : java-primeiros-passos-logica-de-programacao
 */

package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
