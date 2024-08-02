package aceptaelreto;

import java.util.LinkedList;
import java.util.Scanner;

public class RepartiendoElBotin_238 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] totales;
        int numBilletes, villanos, ladron;
        LinkedList<Integer>[] reparto;

        while ((numBilletes = sc.nextInt()) != 0) {
            villanos = sc.nextInt();

            reparto = new LinkedList[villanos];
            totales = new int[villanos];

            if (numBilletes == 0 && villanos == 0) {
                break;
            }

            // Hay que crear cada una de las listas que corresponden 
            // a cada uno de los ladrones. Recordar que son objetos.
            for (int i = 0; i < villanos; i++) {
                reparto[i] = new LinkedList<Integer>();
            }

            // En cada iteraci{on proceso un billete y se le asigna al 
            // ladrón que corresponda
            ladron = 0;
            for (int i = 0; i < numBilletes; i++) {
                reparto[ladron].add(sc.nextInt());
                totales[ladron] += reparto[ladron].getLast();
                if (ladron == villanos - 1) {
                    ladron = 0;
                } else {
                    ladron++;
                }
            }

            for (int i = 0; i < villanos; i++) {
                System.out.print(totales[i] + ":");
                if (!reparto[i].isEmpty()) {
                    System.out.print(reparto[i].poll());
                    while (!reparto[i].isEmpty()) {
                        System.out.print(" " + reparto[i].poll());
                    }
                }
                System.out.println("");

            }

        }

    }
}
