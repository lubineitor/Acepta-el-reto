package aceptaelreto;

import java.util.Scanner;

public class Esgritura_438 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int letras, signos;
		String linea;
		char letra;

		while (sc.hasNext()) {
			linea = sc.nextLine();
			letras = 0;
			signos = 0;

			for (int i = 0; i < linea.length(); i++) {
				letra = linea.charAt(i);
				if ((letra > 96 && letra < 123) || (letra > 64 && letra < 91)) {
					letras++;
				} else if (letra == '!') {
					signos++;
				}

			}
			if (signos > letras) {
				System.out.println("ESGRITO");
			} else {
				System.out.println("escrito");
			}

		}
	}

}
