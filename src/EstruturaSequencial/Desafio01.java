package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, preco, area;
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        preco = sc.nextDouble();
        area = largura * comprimento;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", area * preco);



        sc.close();
    }
}
