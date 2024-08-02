package aceptaelreto;

import java.util.Scanner;

public class ElMejorDatoDelParoTLE_154 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int meses;
        int[] tasaParo;
        StringBuilder sb = new StringBuilder(); // Para almacenar el resultado
        int j, contador;

        while ((meses = in.nextInt()) != 0) {
            tasaParo = new int[meses];
            sb.delete(0, sb.length());

            for (int i = 0; i < meses; i++) {
                tasaParo[i] = in.nextInt();
            }

            sb.append("0");
            for (int i = 1; i < meses; i++) {
                // Cuento cuántos meses anteriores al mes i
                // tienen una tasa de paro peor (más grande)
                j = i - 1; // Se empieza por el mes anterior
                contador = 0; // Se inicializa el contador de meses con peor tasa de paro
                while (j >= 0 && tasaParo[j] > tasaParo[i]) {
                    contador++;
                    j--;
                }
                sb.append(" ").append(contador);
            }
            System.out.println(sb);
        }
    }
}


    

