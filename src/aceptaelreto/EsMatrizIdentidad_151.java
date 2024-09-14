package aceptaelreto;

import java.io.*;

public class EsMatrizIdentidad_151 {

    private static boolean esIdentidad(int[][] matriz) {
        int n = matriz.length;
        for (int f = 0; f < n; f++) {
            if (matriz[f][f] != 1) {
                return false;
            }
            for (int c = 0; c < n; c++) {
                if (f != c && matriz[f][c] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String linea;
        while ((linea = br.readLine()) != null) {
            int filas = Integer.parseInt(linea.trim());
            if (filas == 0) break;

            int[][] matriz = new int[filas][filas];
            for (int f = 0; f < filas; f++) {
                String[] valores = br.readLine().trim().split(" ");
                for (int c = 0; c < filas; c++) {
                    matriz[f][c] = Integer.parseInt(valores[c]);
                }
            }

            if (esIdentidad(matriz)) {
                pw.println("SI");
            } else {
                pw.println("NO");
            }
        }

        pw.flush();
    }
}
