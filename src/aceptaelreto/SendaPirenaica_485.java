package aceptaelreto;

import java.util.Scanner;

public class SendaPirenaica_485 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroEtapas;
		int distanciaEtapa[];
		int total;

		while ((numeroEtapas = sc.nextInt()) != 0) {
			distanciaEtapa = new int[numeroEtapas];
			total = 0;
			for (int i = 0; i < distanciaEtapa.length; i++) {
				distanciaEtapa[i] = sc.nextInt();
				total += distanciaEtapa[i];
			}

			System.out.print(total);
			for (int i = 1; i < distanciaEtapa.length; i++) {
				total -= distanciaEtapa[i - 1];
				System.out.print(" " + total);

			}
			System.out.println("");
		}

	}

}
