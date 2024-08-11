package aceptaelreto;

import java.util.Scanner;

public class DesconfianzaASALE_522 {

	private static float codigo(String palabra, int posicion) {
		if (palabra.charAt(posicion) == 'c' && palabra.charAt(posicion + 1) == 'h') {
			return 99.5F;
		} else if (palabra.charAt(posicion) == 'l' && palabra.charAt(posicion + 1) == 'l') {
			return 108.5F;
		} else {
			return palabra.charAt(posicion);
		}

	}

	private static int siguiente(float codigo, int valor) {
		if (codigo == (int) codigo) {
			return valor + 1;
		} else {
			return valor + 2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1, palabra2;
		float codigo1, codigo2;
		int puntero1, puntero2;
		int min;
		boolean impreso;

		// Cada iteracion del siguiente bucle representa un caso nuevo
		while (sc.hasNext()) {

			palabra1 = sc.next();
			palabra2 = sc.next();

			impreso = false;
			puntero1 = 0;// Apunta al carácter que se esta procesando de palabra 1
			puntero2 = 0;// Apunta al carácter que se esta procesando de palabra 2

			min = Math.min(palabra1.length(), palabra2.length());

			for (int i = 0; i < min; i++) {
				codigo1 = codigo(palabra1, puntero1);
				codigo2 = codigo(palabra2, puntero2);

				if (codigo1 < codigo2) {
					System.out.println(palabra1);
					impreso = true;
					break;
				} else if (codigo2 < codigo1) {
					System.out.println(palabra2);
					impreso = true;
					break;
				} else {
					puntero1 = siguiente(codigo1, puntero1);
					puntero2 = siguiente(codigo2, puntero2);
					if (puntero1 >= min || puntero2 >= min) {
						break;
					}
				}
				if (!impreso) {
					if (palabra1.length() < palabra2.length()) {
						System.out.println(palabra1);
					} else {
						System.out.println(palabra2);
					}
				}
			}

		}

	}
}
