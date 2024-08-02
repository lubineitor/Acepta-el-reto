package aceptaelreto;

import java.util.Scanner;

public class ElMejorDatoDelParo_514 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int meses;
        int[] tasaParo, acumulado;
        int j;

        while ((meses = in.nextInt()) != 0) {
            tasaParo = new int[meses];
            acumulado = new int[meses];

            for (int i = 0; i < meses; i++) {
                tasaParo[i] = in.nextInt();
            }

            acumulado[0] = 0;
            System.out.print(acumulado[0]);
            for (int i = 1; i < meses; i++) {
                /*
                    Dada la tasa de paro del mes i, se comprueba si el mes 
                    anterior tenía una tasa mayor.
                    Si es cierto, en lugar de ir contando secuencialmente
                    hacia atrás meses con tasa de paro mayor, se salta
                    hacia atrás el número de meses con una tasa mayor que tenía
                    el mes anterior.
                    Por ejemplo, 5 7 6 3 4
                    Supóngase que se está procesando el último dato.
                    En ese punto ya está creado el vector meses con valores
                        paro [ 5 7 6 3 4 ]
                        meses[ 0 0 1 3 ? ]
                    Si el mes anterior (que tiene más paro que el actual) ya 
                    acumulaba 3 meses de descenso, esos tres meses no es preciso
                    procesarlos. Por ello la variable j que indica qué mes se
                    procesa se actualiza como j = j-(meses[j]-1)
                 */
                j = i - 1; // Se empieza por el mes anterior
                while (j >= 0 && tasaParo[j] > tasaParo[i]) {
                    acumulado[i] += 1 + acumulado[j];
                    j -= acumulado[j] + 1;
                }
                System.out.print(" " + acumulado[i]);
            }
            System.out.println("");
        }
    }
}


    

