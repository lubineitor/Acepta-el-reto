package aceptaelreto;

import java.io.*;

public class SerieDePotencias_222 {
	public static void main(String[] args) {
		final int MOD = 1000007;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringBuilder sb = new StringBuilder();
			String line;

			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.isEmpty())
					continue;

				String[] tokens = line.split("\\s+");
				if (tokens.length != 2)
					continue;

				try {
					int x = Integer.parseInt(tokens[0]);
					int n = Integer.parseInt(tokens[1]);

					sb.append(calcularSumaDePotencias(x, n, MOD)).append("\n");
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}

			System.out.print(sb.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int calcularSumaDePotencias(int x, int n, int mod) {
		int potencia = 1;
		int suma = 1;

		for (int i = 1; i <= n; i++) {
			potencia = (potencia * x) % mod;
			suma = (suma + potencia) % mod;
		}

		return suma;
	}
}
