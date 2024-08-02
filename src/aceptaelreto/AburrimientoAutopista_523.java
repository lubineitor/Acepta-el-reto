package aceptaelreto;

import java.util.Scanner;

public class AburrimientoAutopista_523 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        String miMatricula, matriculoOtros;
        String numero1, numero2, letras1, letras2;
        int viejos, nuevos;

        for (int i = 0; i < casos; i++) {
            miMatricula = sc.next();
            numero1 = miMatricula.substring(0, 4);
            letras1 = miMatricula.substring(4, 7);

            nuevos = 0;
            viejos = 0;

            while (true) {

                matriculoOtros = sc.next();
                if (matriculoOtros.equals("0")) {
                    break;
                }

                numero2 = matriculoOtros.substring(0, 4);
                letras2 = matriculoOtros.substring(4, 7);

                if (letras1.equals(letras2)) {
                    if (numero2.compareTo(numero1) < 0) {
                        viejos++;
                    } else {
                        nuevos++;
                    }
                } else {
                    if (letras1.compareTo(letras2) < 0) {
                        nuevos++;
                    } else {
                        viejos++;
                    }
                }
            }
            System.out.println(viejos + " " + nuevos);
        }
    }

}
