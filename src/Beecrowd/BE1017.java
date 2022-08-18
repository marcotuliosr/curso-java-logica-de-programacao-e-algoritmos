package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BE1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempoHora;
        int velocidadeHora;
        tempoHora = sc.nextInt();
        velocidadeHora = sc.nextInt();

        double qtdLitros = (double) tempoHora * velocidadeHora / 12;
        System.out.printf("%.3f%n", qtdLitros);

        sc.close();
    }
}
