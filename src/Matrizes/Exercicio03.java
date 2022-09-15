package Matrizes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] maior = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maior[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            int maiorNumero = maior[i][0];
            for (int j = 0; j < N; j++) {
                if (maior[i][j] > maiorNumero) {
                    maiorNumero = maior[i][j];
                }
            }
            System.out.println(maiorNumero);
        }

        sc.close();
    }
}
