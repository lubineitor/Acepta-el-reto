package aceptaelreto;

import java.io.*;
import java.util.*;

public class AproximacionDeGauss_107 {
	public static void main(String[] args) throws IOException {
		int tamMax = 100000;
		int[] pi = new int[tamMax + 1];
		boolean[] marcado = new boolean[tamMax + 1];

		Arrays.fill(marcado, true);
		marcado[0] = false;
		marcado[1] = false;

		int sqrtMax = (int) Math.sqrt(tamMax);
		for (int i = 2; i <= sqrtMax; i++) {
			if (marcado[i]) {
				for (int j = i * i; j <= tamMax; j += i) {
					marcado[j] = false;
				}
			}
		}

		int numPrimos = 0;
		for (int i = 2; i <= tamMax; i++) {
			if (marcado[i]) {
				numPrimos++;
			}
			pi[i] = numPrimos;
		}

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder output = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			String[] tokens = line.split(" ");
			int n = Integer.parseInt(tokens[0]);
			int m = Integer.parseInt(tokens[1]);
			if (n == 0 && m == 0)
				break;

			double error = Math.abs(pi[n] * Math.log(n) - n);
			double tolerancia = n * Math.log(n) * Math.pow(10, -m);

			final double epsilon = 1e-9;
			if (Math.abs(error - tolerancia) < epsilon) {
				output.append("Igual\n");
			} else if (error > tolerancia) {
				output.append("Mayor\n");
			} else {
				output.append("Menor\n");
			}
		}

		System.out.print(output);
	}
}
