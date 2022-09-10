package Vetores;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numeros = new int[N];
        int cont = 0;


        for (int i = 0; i < N; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 2 == 0)
                cont++;
            {

                System.out.printf("%d ", numeros[j]);

            }
        }
        System.out.print("\n" + cont);
        sc.close();
    }
}
