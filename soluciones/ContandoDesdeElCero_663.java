package aceptaelreto;

import java.io.*;

public class ContandoDesdeElCero_663 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int casos = Integer.parseInt(br.readLine());

            for (int i = 0; i < casos; i++) {
                int anio = Integer.parseInt(br.readLine());
                
                if (anio > 0) {
                    bw.write(String.valueOf(anio - 1));
                } else {
                    bw.write(String.valueOf(anio));
                }
                bw.newLine();
            }

            bw.flush();
        }
    }
}
