package aceptaelreto;

import java.io.*;
import java.util.*;

public class Por3OMas5TLE_192 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter writer = new PrintWriter(System.out)) {

			while (true) {
				int num = Integer.parseInt(reader.readLine().trim());
				if (num == 0) {
					break;
				}

				if (esGenerable(num)) {
					writer.println("SI");
				} else {
					writer.println("NO");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean esGenerable(int objetivo) {
		if (objetivo == 1) {
			return true;
		}

		Queue<Integer> cola = new LinkedList<>();
		HashSet<Integer> visitados = new HashSet<>();

		cola.add(1);
		visitados.add(1);

		while (!cola.isEmpty()) {
			int actual = cola.poll();

			int multiplicacion = actual * 3;
			int suma = actual + 5;

			if (multiplicacion == objetivo || suma == objetivo) {
				return true;
			}

			if (multiplicacion < objetivo && !visitados.contains(multiplicacion)) {
				cola.add(multiplicacion);
				visitados.add(multiplicacion);
			}
			if (suma < objetivo && !visitados.contains(suma)) {
				cola.add(suma);
				visitados.add(suma);
			}
		}

		return false;
	}
}
