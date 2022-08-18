package EstruturaSequencial;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        System.out.println(y); /* imprimindo valor de y */
        System.out.println(x); /* imprimindo valor de x */
        System.out.printf("%.2f%n", x); /* imprimindo valor de x com 2 casas */
        System.out.printf("%.4f%n", x); /* imprimindo valor de x com 4 casas */
        Locale.setDefault(Locale.US); /* padrão para uso de ponto */
        System.out.printf("%.4f%n", x); /* imprimindo x com 4 casas / ponto */
        /* concatenacao de varios elementos PRINTLN */
        System.out.println("Resultado = " + x + " METROS");
        /* concatenacao de varios elementos PRINTLN */
        System.out.printf("RESULTADO = %.2f metros%n", x);


    }
}
