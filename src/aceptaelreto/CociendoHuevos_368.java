package aceptaelreto;

import java.util.Scanner;

public class CociendoHuevos_368 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int huevos, capacidad, coccion;

		do {
			huevos = sc.nextInt();
			capacidad = sc.nextInt();
			coccion = 10;

			if (huevos == 0) {
				break;
			}

			if (huevos <= capacidad) {
				System.out.println(coccion);
			} else {
				do {
					if (huevos > capacidad) {
						huevos -= capacidad;
						coccion += 10;
					}

				} while (huevos > capacidad);
				System.out.println(coccion);
			}

		} while (huevos != 0 && capacidad != 0);
	}

}
