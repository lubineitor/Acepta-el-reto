package aceptaelreto;

import java.util.Scanner;

public class PalabrasPentavocalicas2_300 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String palabra;
        int casos = in.nextInt();
        in.nextLine(); // Para vaciar el buffer de entrada (aún queda un enter pendiente de procesar)
        int pos;
        byte pentavocalica;

        for (; casos > 0; casos--) {
            // En cada iteración proceso una palabra nueva
            palabra = in.nextLine();
            pentavocalica = 0;
            pos = 0;
            char letra;
            // En cada iteración, proceso la letra que está
            // en la posición pos
            while (pos < palabra.length() && pentavocalica != 31) {
                letra = palabra.charAt(pos);
                if (letra == 'a') {
                    pentavocalica |= 1;
                } else if (letra == 'e') {
                    pentavocalica |= 2;
                } else if (letra == 'i') {
                    pentavocalica |= 4;
                } else if (letra == 'o') {
                    pentavocalica |= 8;
                } else if (letra == 'u') {
                    pentavocalica |= 16;
                }
                pos++;
            }

            if (pentavocalica == 31) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}
