package aceptaelreto;

import java.io.*;

public class Torfiles_738 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder result = new StringBuilder();
			String line;

			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split(" ");
				int n = Integer.parseInt(tokens[0]);
				int p = Integer.parseInt(tokens[1]);

				boolean[] diagonalAtacada = new boolean[2 * n - 1];
				boolean[] filaAtacada = new boolean[n];

				for (int i = 0; i < p; i++) {
					String[] pos = reader.readLine().split(" ");
					int fila = Integer.parseInt(pos[0]);
					int columna = Integer.parseInt(pos[1]);
					diagonalAtacada[fila - columna + n - 1] = true;
					filaAtacada[fila - 1] = true;
				}

				int[] filasMenores = new int[n];
				int filasNoAtacadas = 0;

				for (int i = 0; i < n; i++) {
					if (!filaAtacada[i])
						filasNoAtacadas++;
					filasMenores[i] = filasNoAtacadas;
				}

				long posNoAtaques = 0;

				for (int d = 0; d < 2 * n - 1; d++) {
					if (diagonalAtacada[d])
						continue;

					int numDiag = d - n + 1;
					if (numDiag <= 0) {
						int filaLimite = n - 1 + numDiag;
						posNoAtaques += filasMenores[filaLimite];
					} else {
						posNoAtaques += filasMenores[n - 1] - filasMenores[numDiag - 1];
					}
				}

				result.append(posNoAtaques).append("\n");
			}

			System.out.print(result.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}