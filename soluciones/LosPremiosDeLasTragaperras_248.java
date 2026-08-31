package aceptaelreto;

import java.util.*;

public class LosPremiosDeLasTragaperras_248 {

	public static boolean resuelveCaso(Scanner sc) {
		int L = sc.nextInt();

		if (L == 0) {
			return false;
		}

		int mejorHastaAhora = Integer.MIN_VALUE;
		int mejorDeAhora = 0;
		int suma = 0;
		int maxInicio = Integer.MIN_VALUE;
		int minInicio = Integer.MAX_VALUE;

		for (int i = 0; i < L; i++) {
			int valor = sc.nextInt();
			suma += valor;
			mejorDeAhora += valor;

			maxInicio = Math.max(maxInicio, suma);
			minInicio = Math.min(minInicio, suma);

			if (mejorDeAhora < 0) {
				mejorDeAhora = 0;
			}
			
			mejorHastaAhora = Math.max(mejorHastaAhora, mejorDeAhora);
		}
		
		int maxFinal = suma - minInicio;
		int mejor = Math.max(mejorHastaAhora, maxFinal + maxInicio);

		System.out.println(mejor);
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (resuelveCaso(sc));

		sc.close();
	}
}