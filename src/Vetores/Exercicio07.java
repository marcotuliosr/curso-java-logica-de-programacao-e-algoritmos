package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        double[] primeiro = new double[N];
        double[] segundo = new double[N];


        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            primeiro[i] = sc.nextDouble();
            segundo[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < N; i++) {
            double media = (primeiro[i] + segundo[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
