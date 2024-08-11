
package aceptaelreto;

import java.util.Scanner;

public class Volumen_156 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int problema;

		for (int i = 0; i < casos; i++) {
			problema = sc.nextInt();
			System.out.println(problema / 100);
		}

	}

}
