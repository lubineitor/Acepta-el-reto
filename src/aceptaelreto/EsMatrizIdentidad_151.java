package aceptaelreto;

import java.util.Scanner;

public class EsMatrizIdentidad_151 {

	private static boolean esIdentidad(int[][] matriz) {
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				if (f == c) {
					if (matriz[f][c] != 1) {
						return false;
					} else {
						if (matriz[f][c] != 0) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas;
		int[][] matriz;

		while ((filas = sc.nextInt()) != 0) {
			matriz = new int[filas][filas];
			for (int f = 0; f < matriz.length; f++) {
				for (int c = 0; c < matriz[f].length; c++) {
					matriz[f][c] = sc.nextInt();
				}
			}
			if (esIdentidad(matriz)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}
}
