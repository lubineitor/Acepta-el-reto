package aceptaelreto;

import java.io.*;

public class SerieDePotencias_222 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		final int MOD = 1000007;
		String line;

		StringBuilder input = new StringBuilder();
		while ((line = br.readLine()) != null) {
			input.append(line).append("\n");
		}

		String[] lines = input.toString().split("\n");
		for (String l : lines) {
			l = l.trim();
			if (l.isEmpty())
				continue;

			String[] tokens = l.split("\\s+");
			if (tokens.length != 2)
				continue;

			int x, n;
			try {
				x = Integer.parseInt(tokens[0]);
				n = Integer.parseInt(tokens[1]);
			} catch (NumberFormatException e) {
				continue;
			}

			int potencia = 1, suma = 1;
			for (int i = 0; i < n; ++i) {
				potencia = (potencia * x) % MOD;
				suma = (suma + potencia) % MOD;
			}

			sb.append(suma).append("\n");
		}

		System.out.print(sb.toString());

		br.close();
	}
}