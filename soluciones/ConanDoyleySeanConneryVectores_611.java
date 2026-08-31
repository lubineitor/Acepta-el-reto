package aceptaelreto;

import java.util.Scanner;

public class ConanDoyleySeanConneryVectores_611 {

	private static String primeraObraSir(int ano, int[] anos, String[] obras) {
		int menor = Integer.MAX_VALUE;
		int posicion = 0;
		int contador = 0;

		for (int i = 0; i < obras.length; i++) {
			if (anos[i] >= ano) {
				contador++;
				if (anos[i] < menor) {
					menor = anos[i];
					posicion = i;
				}
			}
		}

		if (contador == 0) {
			return "NINGUNA";
		} else if (contador == obras.length) {
			return "TODAS";
		} else {
			return obras[posicion];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int anoSir;
		int numObras;
		int[] anosPublicacion;
		String[] obras;

		while (sc.hasNext()) {
			anoSir = sc.nextInt();
			sc.nextLine();// Ignoro mombre autor porque no se utiliza
			numObras = sc.nextInt();

			anosPublicacion = new int[numObras];
			obras = new String[numObras];

			for (int i = 0; i < numObras; i++) {
				anosPublicacion[i] = sc.nextInt();
				obras[i] = sc.nextLine();// Cuidado! NextLine() también lee el
				// espacio en blanco que hay entre los años y el nombre de las
				// obras, hay que eliminarlo
				obras[i] = obras[i].substring(1, obras[i].length());
			}
			System.out.println(primeraObraSir(anoSir, anosPublicacion, obras));

		}

	}

}
