package EstruturaRepetitiva;

import java.util.Scanner;

public class ExResolvido02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;


        while (idade >= 0) {
            soma += idade;
            cont += 1;
            idade = sc.nextInt();
        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);

        } else {
            System.out.println("impossivel calcular");
        }
        sc.close();
    }
}
