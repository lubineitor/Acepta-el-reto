package aceptaelreto;

import java.util.HashSet;
import java.util.Scanner;

public class MichaelJFoxyelPatoDonald_416 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numFechas;
		String fecha;
		HashSet<String> fechas = new HashSet();

		while ((numFechas = sc.nextInt()) != 0) {
			fechas.clear();
			for (int i = 0; i < numFechas; i++) {
				fecha = sc.next();
				fecha = fecha.substring(0, fecha.length() - 5);
				fechas.add(fecha);
			}
			if (fechas.size() == numFechas) {
				System.out.println("NO");
			} else {
				System.out.println("SI");
			}
		}
	}

}
