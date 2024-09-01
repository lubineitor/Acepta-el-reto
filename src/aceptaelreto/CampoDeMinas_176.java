package aceptaelreto;

import java.io.*;

public class CampoDeMinas_176 {

	public static int buscarMinas(char[][] m, int i, int j) {
		int[] posF = { 1, -1, 0, 0, 1, -1, -1, 1 };
		int[] posC = { 0, 0, 1, -1, 1, -1, 1, -1 };
		int f, c, minas = 0;
		for (int k = 0; k < 8; k++) {
			f = i + posF[k];
			c = j + posC[k];
			if (safe(f, c) && m[f][c] == '*') {
				minas++;
			}
		}
		return minas;
	}

	public static boolean safe(int i, int j) {
		return i >= 0 && i < r && j >= 0 && j < c;
	}

	public static int r;
	public static int c;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();

		char[][] m;
		String linea;

		while (true) {
			String[] dims = br.readLine().split(" ");
			c = Integer.parseInt(dims[0]);
			r = Integer.parseInt(dims[1]);
			if (r == 0 || c == 0)
				break;

			m = new char[r][c];
			for (int i = 0; i < r; i++) {
				linea = br.readLine();
				for (int j = 0; j < c; j++) {
					m[i][j] = linea.charAt(j);
				}
			}

			int minas = 0;
			int cantidad;

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (m[i][j] == '-') {
						cantidad = buscarMinas(m, i, j);
						if (cantidad >= 6)
							minas++;
					}
				}
			}

			sb.append(minas).append("\n");
		}

		pw.print(sb.toString());
		pw.flush();
	}
}