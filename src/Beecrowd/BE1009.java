package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BE1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeFuncionario = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendasEfetuadas = sc.nextDouble();

        double comissao = (vendasEfetuadas * 0.15) + salarioFixo;
        System.out.printf("TOTAL = R$ %.2f%n", comissao);


        sc.close();
    }
}
