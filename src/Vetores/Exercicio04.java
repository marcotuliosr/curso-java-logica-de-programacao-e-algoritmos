package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] aritimetica = new double[N];

        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            aritimetica[i] = sc.nextDouble();
            soma = soma + aritimetica[i];
        }
        double media = (double) soma / N;
        System.out.println(media);
        for (int j = 0; j < aritimetica.length; j++) {
            if (aritimetica[j] < media) {
                System.out.println(aritimetica[j]);
                sc.close();
            }
        }
        sc.close();
    }
}