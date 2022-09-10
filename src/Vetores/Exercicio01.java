package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double max = 0.0;
        int elemento = -1;
        double[] numeros = new double[N];


        for (int i = 0; i < N; i++) {
            numeros[i] = sc.nextDouble();
        }

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] > max) {
                max = numeros[j];
                elemento = j;
            }
        }
        System.out.printf("%.1f%n", max);
        System.out.println(elemento);

        sc.close();
    }
}



