package aceptaelreto;

import java.util.Scanner;

public class IncidenciaAcumulada_641 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			if (k == 0 && n == 0) {
				break;
			}
			long maxIncidencia = calcularIncidenciaAcumulada(sc, k, n);
			System.out.println(maxIncidencia);
		}
		sc.close();
	}

	private static long calcularIncidenciaAcumulada(Scanner sc, int k, int n) {
		long[] sums = new long[n];
		long sum = 0;
		long incidencia = 0;

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			sum += num;
			sums[i] = sum;

			if (i < k) {
				incidencia += num;
			}
		}

		for (int i = 1; i <= n - k; i++) {
			long currentWindowSum = sums[i + k - 1] - sums[i - 1];
			incidencia = Math.max(incidencia, currentWindowSum);
		}
		return incidencia;
	}
}
