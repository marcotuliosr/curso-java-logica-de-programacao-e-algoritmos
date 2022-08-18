package EstruturaSequencial;

import java.util.Scanner;

public class Resolvido04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hora = n / 3600;
        int resto = n % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(hora + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
