package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BE1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double entrada = sc.nextDouble();
        double reajuste = 0;
        double salario = 0;

        if (entrada >= 0 && entrada <= 400.00) {
            reajuste = (entrada / 100) * 15;
            salario = reajuste + entrada;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if ((entrada >= 400.01 && entrada <= 800.00)) {
            reajuste = (entrada / 100) * 12;
            salario = reajuste + entrada;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 12 %");
        } else if ((entrada >= 800.01 && entrada <= 1200.00)) {
            reajuste = (entrada / 100) * 10;
            salario = reajuste + entrada;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 10 %");
        } else if ((entrada >= 1200.01 && entrada <= 2000.00)) {
            reajuste = (entrada / 100) * 7;
            salario = reajuste + entrada;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 7 %");
        }

        else {
            reajuste = (entrada / 100) * 4;
            salario = reajuste + entrada;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 4 %");
        }


        sc.close();
    }
}