package aceptaelreto;

import java.io.*;
import java.util.*;

public class RepartiendoElBotin_238 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        String input;
        int[] totales;
        int numBilletes, villanos, ladron;
        LinkedList<Integer>[] reparto;
        boolean firstCase = true;

        while ((input = br.readLine()) != null) {
            String[] primeraLinea = input.split(" ");
            numBilletes = Integer.parseInt(primeraLinea[0]);
            villanos = Integer.parseInt(primeraLinea[1]);

            if (numBilletes == 0 && villanos == 0) {
                break;
            }

            reparto = new LinkedList[villanos];
            totales = new int[villanos];

            for (int i = 0; i < villanos; i++) {
                reparto[i] = new LinkedList<Integer>();
            }

            String[] billetes = br.readLine().split(" ");
            ladron = 0;

            for (int i = 0; i < numBilletes; i++) {
                int billete = Integer.parseInt(billetes[i]);
                reparto[ladron].add(billete);
                totales[ladron] += billete;

                ladron = (ladron + 1) % villanos;
            }

            if (!firstCase) {
                pw.println("---");
            }
            firstCase = false;

            for (int i = 0; i < villanos; i++) {
                pw.print(totales[i] + ":");
                if (!reparto[i].isEmpty()) {
                    pw.print(reparto[i].poll());
                    while (!reparto[i].isEmpty()) {
                        pw.print(" " + reparto[i].poll());
                    }
                }
                pw.println();
            }
        }

        pw.println("---");
        pw.flush();
        pw.close();
    }
}
