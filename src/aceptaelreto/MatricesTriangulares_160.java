package aceptaelreto;

import java.io.*;

public class MatricesTriangulares_160 {

	private static boolean esTriangularSuperior(int[][] matriz) {
		for (int fila = 0; fila < matriz.length - 1; fila++) {
			for (int col = fila + 1; col < matriz[0].length; col++) {
				if (matriz[fila][col] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean esTriangularInferior(int[][] matriz) {
		for (int fila = 1; fila < matriz.length; fila++) {
			for (int col = 0; col < fila; col++) {
				if (matriz[fila][col] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		String input;
		while (!(input = br.readLine()).equals("0")) {
			int filas = Integer.parseInt(input);
			int[][] matriz = new int[filas][filas];

			for (int fila = 0; fila < filas; fila++) {
				String[] datosFila = br.readLine().split(" ");
				for (int col = 0; col < filas; col++) {
					matriz[fila][col] = Integer.parseInt(datosFila[col]);
				}
			}

			if (esTriangularSuperior(matriz) || esTriangularInferior(matriz)) {
				pw.println("SI");
			} else {
				pw.println("NO");
			}
		}

		pw.flush();
	}
}
