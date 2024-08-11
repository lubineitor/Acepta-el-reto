package aceptaelreto;

import java.util.Scanner;

public class Ascensor_156 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int recorrido, origen, destino;

		while ((origen = sc.nextInt()) != -1) {
			// Cada iteracción representa un caso de prueba.
			recorrido = 0;
			while ((destino = sc.nextInt()) != -1) {
				recorrido += Math.abs(origen - destino);
				origen = destino;
			}
			System.out.println(recorrido);
		}
	}
}
