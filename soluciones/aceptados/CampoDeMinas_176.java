package aceptaelreto;

import java.io.*;

public class CampoDeMinas_176 {

    public static int buscarMinas(char[][] m, int i, int j, int r, int c) {
        int[] posF = { 1, -1, 0, 0, 1, -1, -1, 1 };
        int[] posC = { 0, 0, 1, -1, 1, -1, 1, -1 };
        int minas = 0;

        for (int k = 0; k < 8; k++) {
            int f = i + posF[k];
            int co = j + posC[k];

            if (f >= 0 && f < r && co >= 0 && co < c && m[f][co] == '*') {
                minas++;
            }
        }
        return minas;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] dims = br.readLine().split(" ");
            int c = Integer.parseInt(dims[0]);
            int r = Integer.parseInt(dims[1]);
            
            if (r == 0 || c == 0)
                break;

            char[][] m = new char[r][c];
            for (int i = 0; i < r; i++) {
                String linea = br.readLine();
                for (int j = 0; j < c; j++) {
                    m[i][j] = linea.charAt(j);
                }
            }

            int minas = 0;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (m[i][j] == '-') {
                        int cantidad = buscarMinas(m, i, j, r, c);
                        if (cantidad >= 6) {
                            minas++;
                        }
                    }
                }
            }

            sb.append(minas).append("\n");
        }

        pw.print(sb.toString());
        pw.flush();
    }
}
