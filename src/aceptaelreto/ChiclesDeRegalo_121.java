package aceptaelreto;

import java.util.Scanner;

public class ChiclesDeRegalo_121 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int envoltorios, regalo, chicles, contador;
		int envoltoriosRestantes, chiclesAnterior;

		while (true) {
			envoltorios = sc.nextInt();
			regalo = sc.nextInt();
			chicles = sc.nextInt();

			if (envoltorios == 0 && regalo == 0 && chicles == 0) {
				break;
			}
			if (regalo >= envoltorios && chicles >= envoltorios) {
				System.out.println("RUINA");
			} else if (regalo == 0) {
				System.out.println(chicles + " " + chicles);
			} else {
				contador = 0;
				envoltoriosRestantes = 0;
				while ((chicles + envoltoriosRestantes) >= envoltorios) {
					contador += chicles;

					chiclesAnterior = chicles;
					chicles = (chicles + envoltoriosRestantes) / envoltorios * regalo;
					envoltoriosRestantes = (chiclesAnterior + envoltoriosRestantes) % envoltorios;

				}
				contador += chicles;
				envoltoriosRestantes += chicles;
				System.out.print(contador + " ");
				System.out.println(envoltoriosRestantes);
			}

		}

	}

}
