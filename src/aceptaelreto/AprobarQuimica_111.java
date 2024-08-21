package aceptaelreto;

import java.io.*;

public class AprobarQuimica_111 {
	public static int disponibles(String nivel) {
		switch (nivel.charAt(1)) {
		case 's':
			return 2;
		case 'p':
			return 6;
		case 'd':
			return 10;
		case 'f':
			return 14;
		default:
			return 0;
		}
	}

	public static void main(String[] args) throws IOException {
		String[] niveles = { "1s", "2s", "2p", "3s", "3p", "4s", "3d", "4p", "5s", "4d", "5p", "6s", "4f", "5d", "6p",
				"7s", "5f", "6d", "7p" };

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String elemento;

		elemento = reader.readLine();
		while (!elemento.equals("Exit")) {
			int electrones = Integer.parseInt(reader.readLine());
			int i = 0;
			while (electrones > disponibles(niveles[i])) {
				System.out.print(niveles[i] + disponibles(niveles[i]) + " ");
				electrones -= disponibles(niveles[i]);
				i++;
			}
			System.out.println(niveles[i] + electrones);

			elemento = reader.readLine();
		}
	}
}