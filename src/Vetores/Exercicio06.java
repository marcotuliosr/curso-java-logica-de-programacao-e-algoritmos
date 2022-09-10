package Vetores;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[] idade = new int[N];


        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            idade[i] = sc.nextInt();
        }

        int maiorIdade = idade[0];
        int posicaoIdade = 0;


        for (int j = 0; j < idade.length; j++) {
            if (idade[j] > maiorIdade) {
                maiorIdade = idade[j];
                posicaoIdade = j;
            }
        }
        System.out.println("Pessoa mais velha: " + nomes[posicaoIdade]);

        sc.close();
    }
}
