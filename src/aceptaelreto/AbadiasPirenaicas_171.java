package aceptaelreto;

import java.util.Scanner;

public class AbadiasPirenaicas_171 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int picos;
		int[] alturas;
		int maximo;
		int contador = 0;

		while ((picos = sc.nextInt()) != 0) {
			alturas = new int[picos];
			for (int i = 0; i < picos; i++) {
				alturas[i] = sc.nextInt();
				maximo = alturas[picos - 1];
				contador = 1;
				for (int j = picos - 2; j > -1; j--) {
					if (alturas[j] > maximo) {
						maximo = alturas[j];
						contador++;
					}
				}
			}
			System.out.println(contador);
		}
	}
}
