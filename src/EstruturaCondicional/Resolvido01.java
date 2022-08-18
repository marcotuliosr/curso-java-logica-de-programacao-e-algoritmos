package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;


        System.out.println("Digite a primeita nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a primeita nota: ");
        nota2 = sc.nextDouble();

        double total = nota1 + nota2;

        if (total > 60.0) {
            System.out.printf("NOTA FINAL = %.1f%n", total);
        } else {
            System.out.printf("NOTA FINAL = %.1f%n", total);
            System.out.println("REPROVADO");

        }
        sc.close();
    }
}
