package aceptaelreto;

import java.util.*;
import java.io.*;

public class NumerosCubifinitos_139 {

	private final static HashSet<Integer> numeros = new HashSet<>();

	private static void esCubifinito(int n, PrintWriter out) {
		if (n == 1) {
			out.println(" -> cubifinito.");
		} else {
			int nuevo = 0;
			int temp = n;
			while (temp != 0) {
				nuevo += Math.pow(temp % 10, 3);
				temp /= 10;
			}
			if (numeros.contains(nuevo)) {
				out.println(" - " + nuevo + " -> no cubifinito.");
			} else {
				numeros.add(nuevo);
				out.print(" - " + nuevo);
				esCubifinito(nuevo, out);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(System.out, true)) {

			int n;
			while (true) {
				n = Integer.parseInt(br.readLine().trim());
				if (n == 0)
					break;

				numeros.clear();
				out.print(n);
				numeros.add(n);
				esCubifinito(n, out);
			}

			out.flush();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}