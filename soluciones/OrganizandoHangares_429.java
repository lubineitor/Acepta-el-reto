package aceptaelreto;

import java.io.*;

public class OrganizandoHangares_429 {

	private static int hangarConMasEspacio(int[] hangares) {
		int pos = 0;
		int max = hangares[0];
		for (int i = 1; i < hangares.length; i++) {
			if (hangares[i] > max) {
				max = hangares[i];
				pos = i;
			}
		}
		return pos;
	}

	public static boolean hayEspacio(int[] hangares, int[] naves) {
		for (int nave : naves) {
			int posicion = hangarConMasEspacio(hangares);
			if (nave <= hangares[posicion]) {
				hangares[posicion] -= nave;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter writer = new PrintWriter(System.out)) {

			String line;
			while ((line = reader.readLine()) != null && !line.equals("0")) {
				int numHangares = Integer.parseInt(line.trim());
				if (numHangares == 0)
					break;

				int[] hangares = new int[numHangares];
				String[] hangarInputs = reader.readLine().trim().split("\\s+");
				for (int i = 0; i < numHangares; i++) {
					hangares[i] = Integer.parseInt(hangarInputs[i]);
				}

				int numNaves = Integer.parseInt(reader.readLine().trim());
				int[] naves = new int[numNaves];
				String[] naveInputs = reader.readLine().trim().split("\\s+");
				for (int i = 0; i < numNaves; i++) {
					naves[i] = Integer.parseInt(naveInputs[i]);
				}

				if (hayEspacio(hangares, naves)) {
					writer.println("SI");
				} else {
					writer.println("NO");
				}
			}
			writer.flush();

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}
	}
}