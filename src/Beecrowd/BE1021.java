package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BE1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorEntrada = sc.nextDouble();
        int valor = 0;

        System.out.println("NOTAS:");

        valor = (int) valorEntrada / 100;
        System.out.printf("%d nota(s) de R$ 100,00%n", valor);
        valorEntrada = valorEntrada % 100.0;

        valor = (int) valorEntrada / 50;
        System.out.printf("%d nota(s) de R$ 50,00%n", valor);
        valorEntrada = valorEntrada % 50.0;

        valor = (int) valorEntrada / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", valor);
        valorEntrada = valorEntrada % 20.0;

        valor = (int) valorEntrada / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", valor);
        valorEntrada = valorEntrada % 10.0;

        valor = (int) valorEntrada / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", valor);
        valorEntrada = valorEntrada % 5.0;

        valor = (int) valorEntrada / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", valor);
        valorEntrada = valorEntrada % 2.0;

        valorEntrada = valorEntrada * 100.0;

        System.out.println("MOEDAS:");


        valor = (int) valorEntrada / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
        valorEntrada = valorEntrada % 100.0;

        valor = (int) valorEntrada / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
        valorEntrada = valorEntrada % 50.0;

        valor = (int) valorEntrada / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
        valorEntrada = valorEntrada % 25.0;

        valor = (int) valorEntrada / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
        valorEntrada = valorEntrada % 10.0;

        valor = (int) valorEntrada / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
        valorEntrada = valorEntrada % 5.0;

        valor = (int) valorEntrada;
        System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
        valorEntrada = valorEntrada % 1.0;

        sc.close();

    }
}
