package aceptaelreto;

import java.util.Scanner;

public class PuntosDeSilla2_600 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int filas, columnas;
		int[][] matriz;
		int[] menorFila, mayorFila, menorColumna, mayorColumna;

		boolean esPuntoDeSilla;

		while ((filas = sc.nextInt()) != 0) {
			columnas = sc.nextInt();

			matriz = new int[filas][columnas];

			menorFila = new int[filas];
			mayorFila = new int[filas];
			menorColumna = new int[columnas];
			mayorColumna = new int[columnas];

			// Lectura de datos
			for (int f = 0; f < matriz.length; f++) {
				menorFila[f] = Integer.MAX_VALUE;
				mayorFila[f] = Integer.MIN_VALUE;
				for (int c = 0; c < matriz[0].length; c++) {
					matriz[f][c] = sc.nextInt();
					if (matriz[f][c] < menorFila[f]) {
						menorFila[f] = matriz[f][c];
					}
					if (matriz[f][c] < mayorFila[f]) {
						mayorFila[f] = matriz[f][c];
					}
				}
			}

			for (int c = 0; c < columnas; c++) {
				menorColumna[c] = Integer.MAX_VALUE;
				mayorColumna[c] = Integer.MIN_VALUE;

				for (int f = 0; f < filas; f++) {
					if (matriz[f][c] < menorColumna[c]) {
						menorColumna[c] = matriz[f][c];
					}
					if (matriz[f][c] < mayorColumna[c]) {
						mayorColumna[c] = matriz[f][c];
					}
				}
			}

			// Procesamos los elementos
			esPuntoDeSilla = false;
			exterior: for (int f = 0; f < matriz.length; f++) {
				for (int c = 0; c < matriz[0].length; c++) {
					if ((matriz[f][c] == mayorFila[f] && matriz[f][c] == menorColumna[c])
							|| (matriz[f][c] == menorFila[f] && matriz[f][c] == mayorColumna[c])) {
						esPuntoDeSilla = true;
						break exterior;
					}
				}
			}
			if (esPuntoDeSilla) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}

}
