package aceptaelreto;

import java.util.HashSet;
import java.util.Scanner;

public class NumerosCubifinitos_139 {

	private final static HashSet<Integer> numeros = new HashSet();

	private static void esCubifinito(int n) {
		if (n == 1) {
			System.out.println(" -> cubifinito.");
		} else {
			int nuevo = 0;
			while (n != 0) {
				nuevo += Math.pow(n % 10, 3);
				n /= 10;
			}
			if (numeros.contains(nuevo)) {
				System.out.println(" - " + nuevo + " -> no cubifinito.");
			} else {
				numeros.add(nuevo);
				System.out.print(" - " + nuevo);
				esCubifinito(nuevo);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		while ((n = sc.nextInt()) != 0) {
			numeros.clear();
			System.out.print(n);
			numeros.add(n);
			esCubifinito(n);
		}
	}
}
