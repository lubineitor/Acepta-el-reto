package aceptaelreto;

import java.io.*;

public class RunnersApp_653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        while (true) {
            int hectometros = Integer.parseInt(br.readLine());
            if (hectometros == 0)
                break;

            String[] tiemposStr = br.readLine().split(" ");

            int minTiempoTotal = 0;
            for (int i = 0; i < 10; i++) {
                minTiempoTotal += Integer.parseInt(tiemposStr[i]);
            }

            int tiempoKmActual = minTiempoTotal;
            int inicioKmMenorTiempo = 0;

            for (int i = 1; i <= hectometros - 10; i++) {
                tiempoKmActual = tiempoKmActual - Integer.parseInt(tiemposStr[i - 1]) + Integer.parseInt(tiemposStr[i + 9]);

                if (tiempoKmActual < minTiempoTotal || (tiempoKmActual == minTiempoTotal && i > inicioKmMenorTiempo)) {
                    minTiempoTotal = tiempoKmActual;
                    inicioKmMenorTiempo = i;
                }
            }

            int minutos = minTiempoTotal / 60;
            int segundos = minTiempoTotal % 60;

            pw.print((inicioKmMenorTiempo * 100) + "-" + ((inicioKmMenorTiempo + 10) * 100) + " " 
                    + minutos + ":" + (segundos < 10 ? "0" : "") + segundos + "\n");
        }

        pw.flush();
        pw.close();
    }
}
