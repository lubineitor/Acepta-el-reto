package aceptaelreto;

import java.util.Scanner;

public class CuadradosDiabolicosYEsotericos_101 {

	public static int calcularSumaFila(int[][] m, int fila) {
		int sumaFila = 0;
		for (int i = 0; i < m.length; i++) {
			sumaFila += m[fila][i];
		}
		return sumaFila;
	}

	public static int calcularSumaColumna(int[][] m, int columna) {
		int sumaColumna = 0;
		for (int i = 0; i < m.length; i++) {
			sumaColumna += m[i][columna];
		}
		return sumaColumna;
	}

	public static int calcularSumaDiagonalPrincipal(int[][] m) {
		int suma = 0;
		for (int i = 0; i < m.length; i++) {
			suma += m[i][i];
		}
		return suma;
	}

	public static int calcularSumaDiagonalSecundaria(int[][] m) {
		int suma = 0;
		for (int i = 0; i < m.length; i++) {
			suma += m[i][m.length - i - 1];
		}
		return suma;
	}

	public static boolean verificarUnicidad(int[][] m) {
		int n = m.length;
		boolean[] visto = new boolean[n * n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int numero = m[i][j];
				if (numero < 1 || numero > n * n || visto[numero - 1]) {
					return false;
				}
				visto[numero - 1] = true;
			}
		}
		return true;
	}

	public static int calcularSumaEsquinas(int[][] m) {
		int n = m.length;
		return m[0][0] + m[0][n - 1] + m[n - 1][0] + m[n - 1][n - 1];
	}

	public static int calcularSumaCasillasMitad(int[][] m) {
		int n = m.length;
		int mitad = 0;
		int mid = n / 2;

		if (n % 2 == 0) {
			mitad += m[0][mid] + m[0][mid - 1];
			mitad += m[mid][0] + m[mid - 1][0];
			mitad += m[n - 1][mid] + m[n - 1][mid - 1];
			mitad += m[mid][n - 1] + m[mid - 1][n - 1];
		} else {
			mitad += m[0][mid];
			mitad += m[mid][0];
			mitad += m[n - 1][mid];
			mitad += m[mid][n - 1];
		}
		return mitad;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int n = s.nextInt();
			if (n == 0)
				break;

			int[][] m = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					m[i][j] = s.nextInt();
				}
			}

			boolean esDiabolico = true;
			boolean esEsoterico = verificarUnicidad(m);

			int sumaFila0 = calcularSumaFila(m, 0);
			int sumaColumna0 = calcularSumaColumna(m, 0);
			int sumaDiagonalPrincipal = calcularSumaDiagonalPrincipal(m);
			int sumaDiagonalSecundaria = calcularSumaDiagonalSecundaria(m);

			if (sumaFila0 != sumaColumna0 || sumaDiagonalPrincipal != sumaDiagonalSecundaria
					|| sumaDiagonalPrincipal != sumaFila0) {
				esDiabolico = false;
			} else {
				for (int i = 0; i < n; i++) {
					if (calcularSumaFila(m, i) != sumaFila0 || calcularSumaColumna(m, i) != sumaColumna0) {
						esDiabolico = false;
						break;
					}
				}
			}

			int sumaEsquinas = calcularSumaEsquinas(m);
			int sumaCasillasMitad = calcularSumaCasillasMitad(m);
			int sumaEsperada = (sumaFila0 * 4) / n;

			if (esDiabolico) {
				if (sumaEsquinas != sumaEsperada) {
					esDiabolico = false;
				}

				if (n % 2 == 0 && sumaCasillasMitad != sumaEsperada * 2) {
					esEsoterico = false;
				} else if (n % 2 != 0 && sumaCasillasMitad != sumaEsperada) {
					esEsoterico = false;
				}
			}

			if (esDiabolico && esEsoterico) {
				System.out.println("ESOTERICO");
			} else if (esDiabolico) {
				System.out.println("DIABOLICO");
			} else {
				System.out.println("NO");
			}
		}
	}
}