package aceptaelreto;

import java.io.*;

public class LlenandoPiscinas_131 {
	
	private static int getViajes(int piscina, int barreno, int pierde) {
		if (barreno >= piscina) {
			return 1;
		}
		if (pierde >= barreno) {
			return Integer.MAX_VALUE;
		}

		int viajes = 0;

		while (piscina > barreno) {
			viajes += piscina / (barreno - pierde);
			piscina %= (barreno - pierde);
		}
		return viajes + (piscina > 0 ? 1 : 0);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		String line;

		while ((line = reader.readLine()) != null && !line.equals("0 0 0 0 0 0")) {
			String[] inputs = line.split(" ");

			int pisA = Integer.parseInt(inputs[0]);
			int barrA = Integer.parseInt(inputs[1]);
			int piA = Integer.parseInt(inputs[2]);
			int pisB = Integer.parseInt(inputs[3]);
			int barrB = Integer.parseInt(inputs[4]);
			int piB = Integer.parseInt(inputs[5]);

			int yo = getViajes(pisA, barrA, piA);
			int vecino = getViajes(pisB, barrB, piB);

			if (yo == vecino) {
				result.append("EMPATE ").append(yo).append("\n");
			} else if (yo < vecino) {
				result.append("YO ").append(yo).append("\n");
			} else {
				result.append("VECINO ").append(vecino).append("\n");
			}
		}
		System.out.print(result);
	}
}