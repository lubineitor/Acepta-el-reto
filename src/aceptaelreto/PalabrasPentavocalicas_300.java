package aceptaelreto;

import java.util.Scanner;

public class PalabrasPentavocalicas_300 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra;
		int casos = sc.nextInt();
		sc.nextLine();// Para vaciar el buffer de entrada
		int pos;
		boolean a, e, i, o, u;
		boolean pentavocalica;

		for (; casos > 0; casos--) {
			// En cada iteracción proceso una palabra nueva
			palabra = sc.nextLine();
			pos = 0;
			a = false;
			e = false;
			i = false;
			o = false;
			u = false;
			a = false;
			pentavocalica = false;
			// En cada iteración, proceso la letra que está en la posición pos
			while (pos < palabra.length() && !pentavocalica) {
				if (palabra.charAt(pos) == 'a') {
					a = true;
				} else if (palabra.charAt(pos) == 'e') {
					e = true;
				} else if (palabra.charAt(pos) == 'i') {
					i = true;
				} else if (palabra.charAt(pos) == 'o') {
					o = true;
				} else if (palabra.charAt(pos) == 'u') {
					u = true;
				}
				pentavocalica = a && e && i && o && u;
				pos++;
			}
			if (pentavocalica) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}

}
