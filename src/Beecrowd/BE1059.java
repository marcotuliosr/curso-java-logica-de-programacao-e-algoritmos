package Beecrowd;

import java.util.Scanner;

public class BE1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        for(int i=0;i<100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
