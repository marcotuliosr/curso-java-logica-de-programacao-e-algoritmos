package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] numeros = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                numeros[i][j] = sc.nextInt();
            }
        }
        int soma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                soma = soma + numeros[i][j];

            }
            System.out.println(soma);
        }

        sc.close();
    }
}


