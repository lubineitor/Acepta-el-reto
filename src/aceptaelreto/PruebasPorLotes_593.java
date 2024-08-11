package aceptaelreto;

import java.util.Scanner;

public class PruebasPorLotes_593 {

	private static boolean hayPositivo(String muestras, int desde, int hasta) {
		for (int i = desde; i < hasta; i++) {
			if (muestras.charAt(i) == '1') {
				return true;
			}
		}
		return false;
	}

	private static int numeroPruebas(String muestras, int desde, int hasta) {
		if (desde == hasta - 1 || !hayPositivo(muestras, desde, hasta)) {
			return 1;
		} else {
			int suma = desde + hasta;
			if ((hasta - desde) % 2 == 0) {
				return 1 + numeroPruebas(muestras, desde, suma / 2) + numeroPruebas(muestras, suma / 2, hasta);
			} else {
				return 1 + numeroPruebas(muestras, desde, suma / 2 + 1) + numeroPruebas(muestras, suma / 2 + 1, hasta);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String muestras;

		while ((in.nextInt()) != 0) {
			in.nextLine(); // Vaciamos el enter
			muestras = in.nextLine();
			System.out.println(numeroPruebas(muestras, 0, muestras.length()));
		}
	}
}
