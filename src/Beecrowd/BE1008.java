package Beecrowd;

import java.util.Scanner;

public class BE1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFunc = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario;

        salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
