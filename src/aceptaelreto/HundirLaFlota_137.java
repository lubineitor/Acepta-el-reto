package aceptaelreto;

import java.io.*;
import java.util.*;

public class HundirLaFlota_137 {
	public static int size;
	public static boolean correcto;

	public static void obtenerSize(int[][] m, int i, int j) {
		if (!safe(m, i, j)) {
			return;
		} else if (m[i][j] == 1) {
			if (contieneDiagonal(m, i, j)) {
				correcto = false;
				return;
			}
			size++;
			m[i][j] = 2;
			obtenerSize(m, i + 1, j);
			obtenerSize(m, i - 1, j);
			obtenerSize(m, i, j + 1);
			obtenerSize(m, i, j - 1);
		}
	}

	public static boolean contieneDiagonal(int[][] m, int i, int j) {
		return ((safe(m, i - 1, j - 1) && m[i - 1][j - 1] != 0) || // arriba izq
				(safe(m, i + 1, j + 1) && m[i + 1][j + 1] != 0) || // abajo der
				(safe(m, i + 1, j - 1) && m[i + 1][j - 1] != 0) || // abajo izq
				(safe(m, i - 1, j + 1) && m[i - 1][j + 1] != 0)); // arriba der
	}

	public static boolean safe(int[][] m, int i, int j) {
		return (i >= 0 && j >= 0 && i < m.length && j < m[0].length);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int numBarcos = Integer.parseInt(st.nextToken());
			if (numBarcos == 0)
				break;

			List<Integer> tamanyos = new ArrayList<>();
			correcto = true;
			boolean noBarcos = true;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < numBarcos; i++) {
				tamanyos.add(Integer.parseInt(st.nextToken()));
			}

			int dim = Integer.parseInt(br.readLine());
			int[][] m = new int[dim][dim];

			for (int i = 0; i < dim; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < dim; j++) {
					m[i][j] = Integer.parseInt(st.nextToken());
					if (m[i][j] == 1)
						noBarcos = false;
				}
			}

			if (noBarcos) {
				sb.append("NO\n");
			} else {
				for (int i = 0; i < dim; i++) {
					for (int j = 0; j < dim; j++) {
						size = 0;
						if (m[i][j] == 1) {
							obtenerSize(m, i, j);
							if (correcto && tamanyos.contains(size)) {
								tamanyos.remove(Integer.valueOf(size));
							} else {
								correcto = false;
								break;
							}
						}
					}
					if (!correcto)
						break;
				}
				sb.append((correcto && tamanyos.isEmpty()) ? "SI\n" : "NO\n");
			}
		}

		pw.print(sb.toString());
		pw.flush();
	}
}