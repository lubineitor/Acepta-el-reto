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

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		String input;

		try {
			while (!(input = br.readLine()).equals("0")) {
				int filas;
				try {
					filas = Integer.parseInt(input);
					if (filas <= 0) {
						pw.println("NO");
						continue;
					}
				} catch (NumberFormatException e) {
					pw.println("NO");
					continue;
				}

				int[][] matriz = new int[filas][filas];

				for (int fila = 0; fila < filas; fila++) {
					String[] datosFila = br.readLine().split(" ");
					if (datosFila.length != filas) {
						pw.println("NO");
						break;
					}
					for (int col = 0; col < filas; col++) {
						try {
							matriz[fila][col] = Integer.parseInt(datosFila[col]);
						} catch (NumberFormatException e) {
							pw.println("NO");
							break;
						}
					}
				}

				pw.println(esTriangularSuperior(matriz) || esTriangularInferior(matriz) ? "SI" : "NO");
			}
		} catch (IOException e) {
			pw.println("Error de entrada");
		} finally {
			pw.flush();
		}
	}
}
