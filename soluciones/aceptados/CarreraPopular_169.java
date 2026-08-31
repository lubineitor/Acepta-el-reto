package aceptaelreto;

import java.io.*;
import java.util.*;

public class CarreraPopular_169 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int casos = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		String nombre;
		String apellido;
		int contadorCorredores;
		int contadorHermanos;

		for (; casos-- > 0;) {
			map.clear();
			contadorCorredores = 0;
			contadorHermanos = 0;

			while (!(nombre = br.readLine()).equals("====")) {
				contadorCorredores++;
				apellido = nombre.substring(0, nombre.indexOf(",")).toLowerCase();

				if (map.containsKey(apellido)) {
					map.put(apellido, map.get(apellido) + 1);
				} else {
					map.put(apellido, 1);
				}
			}

			for (int count : map.values()) {
				if (count > 1) {
					contadorHermanos += count;
				}
			}

			pw.println(contadorCorredores + " " + contadorHermanos);
		}

		pw.flush();
		pw.close();
	}
}
