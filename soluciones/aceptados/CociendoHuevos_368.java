package aceptaelreto;

import java.io.*;

public class CociendoHuevos_368 {
	
    private static final int TIEMPO_COCION_POR_LOTE = 10;

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			while (true) {
				String linea = br.readLine();

				if (linea == null || linea.trim().isEmpty()) {
					break;
				}

				String[] input = linea.split(" ");
				int numeroHuevos = Integer.parseInt(input[0]);
				int capacidadOlla = Integer.parseInt(input[1]);

				if (numeroHuevos == 0 && capacidadOlla == 0) {
					break;
				}

				int lotesNecesarios = (numeroHuevos + capacidadOlla - 1) / capacidadOlla;

				int tiempoTotalCoccion = lotesNecesarios * TIEMPO_COCION_POR_LOTE;

				pw.println(tiempoTotalCoccion);
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
