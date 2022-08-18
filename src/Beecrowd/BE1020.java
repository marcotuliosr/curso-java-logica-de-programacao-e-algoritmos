package Beecrowd;

import java.util.Scanner;

public class BE1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int ano = idade / 365;
        idade = idade % 365;

        int mes = idade / 30;
        idade = idade % 30;

        int dia = idade;


        System.out.printf("%d ano(s)%n", ano);
        System.out.printf("%d mes(es)%n", mes);
        System.out.printf("%d dia(s)%n", dia);

        sc.close();
    }
}
