package aceptaelreto;

import java.io.*;

public class EscudosDelEjercitoRomano_119 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String inputLine;

			while ((inputLine = reader.readLine()) != null) {
				int ejercito = Integer.parseInt(inputLine);
				if (ejercito == 0) {
					break;
				}

				int totalEscudos = calcularEscudos(ejercito);
				System.out.println(totalEscudos);
			}
		} catch (IOException e) {
			System.err.println("Error leyendo la entrada: " + e.getMessage());
		}
	}

	private static int calcularEscudos(int ejercito) {
		int total = 0;

		while (ejercito > 0) {
			if (ejercito < 4) {
				total += ejercito * 5;
				break;
			}

			int ladoCuadrado = (int) Math.sqrt(ejercito);
			ejercito -= ladoCuadrado * ladoCuadrado;

			int centro = (ladoCuadrado - 2) * (ladoCuadrado - 2);
			int borde = ((ladoCuadrado - 2) * 4) * 2 + 12;
			total += centro + borde;
		}

		return total;
	}
}