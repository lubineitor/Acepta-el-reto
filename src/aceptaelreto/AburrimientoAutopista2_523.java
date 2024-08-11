package aceptaelreto;

import java.util.Scanner;

public class AburrimientoAutopista2_523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		String matriculaEDU, matricula;
		String letrasEDU, letras;
		int modernos, antiguos;
		int numeroEDU, numero;

		for (; casos-- > 0;) {
			antiguos = 0;
			modernos = 0;
			matriculaEDU = sc.next();
			letrasEDU = matriculaEDU.substring(4);
			while (!(matricula = sc.next()).equals("0")) {
				letras = matricula.substring(4);
				if (letrasEDU.compareTo(letras) < 0) {
					modernos++;
				} else if (letrasEDU.compareTo(letras) > 0) {
					antiguos++;
				} else {
					numeroEDU = Integer.valueOf(matriculaEDU.substring(0, 4));
					numero = Integer.valueOf(matricula.substring(0, 4));

					if (numeroEDU > numero) {
						antiguos++;
					} else {
						modernos++;
					}
				}

			}
			System.out.println(antiguos + " " + modernos);
		}

	}

}
