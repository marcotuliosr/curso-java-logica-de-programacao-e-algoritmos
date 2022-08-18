package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exer03_string_casting {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1 = sc.next();
        int idade1 = sc.nextInt();

        String nome2 = sc.next();
        int idade2 = sc.nextInt();

        double media =  (idade1 + idade2) / 2.0;
        System.out.printf("A idade média e de %s e %s é de %.1f anos", nome1, nome2, media);
    }
}
