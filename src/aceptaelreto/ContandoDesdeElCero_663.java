package aceptaelreto;

import java.io.*;

public class ContandoDesdeElCero_663 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        
        int casos = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < casos; i++) {
            int anio = Integer.parseInt(br.readLine());
            
            if (anio > 0) {
                sb.append(anio - 1).append("\n");
            } else {
                sb.append(anio).append("\n");
            }
        }
        
        pw.print(sb.toString());
        pw.flush();
        pw.close();
    }
}

