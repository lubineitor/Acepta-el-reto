package aceptaelreto;

import java.util.*;

public class PersistenciaMultiplicativaNumeros_182 {

    private static int longitudNumero(int num) {
        return String.valueOf(num).length();
    }

    private static int persistencia(int num) {
        int persistencia = 0;

        while (num >= 10) {
            persistencia++;
            int multiplicacion = 1;

            while (num > 0) {
                multiplicacion *= num % 10;
                num /= 10;
            }

            num = multiplicacion;
        }
        return persistencia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int num = sc.nextInt();
            System.out.println(persistencia(num));
        }

        sc.close();
    }
}
