package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] altura = new double[N];
        char[] sexo = new char[N];

        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }
        double menorAltura = 0.0;
        for (int i = 1; i < altura.length; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura);

        double somaDasAlturasDasMulheres = 0.0;
        int contMulheres = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'F') {
                somaDasAlturasDasMulheres = somaDasAlturasDasMulheres + altura[i];
                contMulheres++;
            }
        }

        if (contMulheres == 0) {
            System.out.println("Nao ha nenhuma mulher dentre as pessoas");
        } else {
            double media = somaDasAlturasDasMulheres / contMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        }

        int contHomens = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'M') {
                contHomens++;
            }
        }
        System.out.println("Numero de homens = " + contHomens);
        sc.close();
    }
}
