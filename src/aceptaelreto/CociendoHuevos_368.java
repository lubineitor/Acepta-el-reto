package aceptaelreto;

import java.io.*;

public class CociendoHuevos_368 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			while (true) {
				String line = br.readLine();

				if (line == null || line.trim().isEmpty()) {
					break;
				}

				String[] input = line.split(" ");
				int huevos = Integer.parseInt(input[0]);
				int capacidad = Integer.parseInt(input[1]);

				if (huevos == 0 && capacidad == 0) {
					break;
				}

				int coccion = ((huevos + capacidad - 1) / capacidad) * 10;
				pw.println(coccion);
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
