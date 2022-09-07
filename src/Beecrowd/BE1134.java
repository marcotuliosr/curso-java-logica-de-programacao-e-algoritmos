package Beecrowd;

import java.util.Scanner;

public class BE1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcao > 0) {
            if (opcao == 1) {
                alcool += 1;
                opcao = sc.nextInt();

            } else if (opcao == 2) {
                gasolina += 1;
                opcao = sc.nextInt();

            } else if (opcao == 3) {
                diesel += 1;
                opcao = sc.nextInt();
            } else if (opcao == 4) {
                break;
            } else {
                opcao = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
