package aceptaelreto;

import java.io.*;
import java.util.*;

public class EscaleraDeColor_134 {

	public static void marcarCarta(String[] mazo, String carta) {
		for (int i = 0; i < mazo.length; i++) {
			if (mazo[i].equals(carta)) {
				mazo[i] = "0";
				break;
			}
		}
	}

	public static String verificarEscalera(String[] mazo) {
		int contadorCartasSeguidas = 0;
		boolean inicioEscalera = false;
		boolean huecoEncontrado = false;
		String siguienteCarta = "";

		for (int i = 0; i < mazo.length; i++) {
			if (mazo[i].equals("0")) {
				inicioEscalera = true;
				contadorCartasSeguidas++;
			} else if (inicioEscalera) {
				if (huecoEncontrado)
					return "NADA";
				huecoEncontrado = true;
				siguienteCarta = mazo[i];
			}
			if (contadorCartasSeguidas == 4 && huecoEncontrado)
				return siguienteCarta + " " + paloSeleccionado;
			if (contadorCartasSeguidas == 4 && i + 1 < mazo.length)
				return mazo[i + 1] + " " + paloSeleccionado;
			else if (contadorCartasSeguidas == 4)
				return mazo[i - 4] + " " + paloSeleccionado;
		}
		return "NADA";
	}

	public static char paloSeleccionado;

	public static void main(String[] args) {
		final String[] cartasBaraja = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		final Set<Character> palosValidos = new HashSet<>(Arrays.asList('P', 'D', 'T', 'C'));

		try (BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter escritor = new PrintWriter(System.out)) {

			while (true) {
				String entrada = lector.readLine().trim();
				if (entrada.equals("0"))
					break;

				String[] datosEntrada = entrada.split(" ");
				String[] mazo = Arrays.copyOf(cartasBaraja, cartasBaraja.length);
				boolean esEscalera = true;
				paloSeleccionado = datosEntrada[1].charAt(0);

				for (int i = 0; i < 4; i++) {
					String cartaActual = datosEntrada[i * 2];
					char paloActual = datosEntrada[i * 2 + 1].charAt(0);

					if (!palosValidos.contains(paloActual) || (i > 0 && paloActual != paloSeleccionado)) {
						esEscalera = false;
						break;
					}
					marcarCarta(mazo, cartaActual);
				}

				escritor.println(esEscalera ? verificarEscalera(mazo) : "NADA");
				escritor.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
