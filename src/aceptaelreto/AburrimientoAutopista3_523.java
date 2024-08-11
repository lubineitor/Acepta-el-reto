package aceptaelreto;

import java.util.Scanner;

public class AburrimientoAutopista3_523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		String matriculaEDU, matricula;
		int modernos, antiguos;

		for (; casos-- > 0;) {
			antiguos = 0;
			modernos = 0;
			matriculaEDU = sc.next();
			while (!(matricula = sc.next()).equals("0")) {
				if (matriculaEDU.compareTo(matricula) < 0) {
					modernos++;
				} else {
					antiguos++;
				}
			}
			System.out.println(antiguos + " " + modernos);
		}
	}

}
