package aceptaelreto;

import java.io.*;

public class PruebasPorLotes_593 {

    private static boolean hayPositivo(String muestras, int desde, int hasta) {
        for (int i = desde; i < hasta; i++) {
            if (muestras.charAt(i) == '1') {
                return true;
            }
        }
        return false;
    }

    private static int numeroPruebas(String muestras, int desde, int hasta) {
        if (desde == hasta - 1 || !hayPositivo(muestras, desde, hasta)) {
            return 1;
        } else {
            int suma = desde + hasta;
            if ((hasta - desde) % 2 == 0) {
                return 1 + numeroPruebas(muestras, desde, suma / 2) + numeroPruebas(muestras, suma / 2, hasta);
            } else {
                return 1 + numeroPruebas(muestras, desde, suma / 2 + 1) + numeroPruebas(muestras, suma / 2 + 1, hasta);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);
        
        String line;
        while (!(line = in.readLine()).equals("0")) {
            String muestras = in.readLine();
            out.println(numeroPruebas(muestras, 0, muestras.length()));
        }
    }
}