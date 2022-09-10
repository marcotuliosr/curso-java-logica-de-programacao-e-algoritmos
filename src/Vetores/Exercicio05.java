package Vetores;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] par = new int[N];

        for (int i = 0; i < N; i++) {
            par[i] = sc.nextInt();
        }
        int soma = 0;
        int cont = 0;
        for (int j = 0; j < par.length; j++) {
            if (par[j] % 2 == 0) {
                soma = soma + par[j];
                cont++;
            }
        }
        double media = (double) soma / cont;
        System.out.println(media);
        sc.close();
    }
}
