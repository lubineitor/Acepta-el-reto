package aceptaelreto;

import java.util.Scanner;

public class PersistenciaMultiplicativaNumeros_182 {

    private static int longitudNumero(int num) {
        return 0;
        
    }

    private static int persistencia(int num) {
        int persistencia, multiplicacion, longitud;
        persistencia = 0;

        while ((longitud = longitudNumero(num)) != 1) {
            persistencia++;
            multiplicacion = 1;
            for (int i = 0; i < longitud; i++) {
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

        for (; casos > 0; casos--) {
            System.out.println(persistencia(sc.nextInt()));

        }
    }

}
