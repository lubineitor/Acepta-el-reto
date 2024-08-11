package aceptaelreto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarreraPopular_169 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		String nombre;
		String apellido;
		HashMap<String, Integer> map = new HashMap();
		int contadorCorredores;
		int contadorHermanos;

		for (; casos-- > 0;) {
			map.clear();
			contadorCorredores = 0;
			contadorHermanos = 0;
			while (!(nombre = sc.nextLine()).equals("====")) {
				contadorCorredores++;
				apellido = nombre.substring(0, nombre.indexOf(",")).toLowerCase();
				if (map.containsKey(apellido)) {
					map.put(apellido, map.get(apellido) + 1);
				} else {
					map.put(apellido, 1);
				}
			}
			for (Map.Entry e : map.entrySet()) {
				if ((int) e.getValue() > 1) {
					contadorHermanos += (int) e.getValue();
				}
			}
			System.out.println(contadorCorredores + " " + contadorHermanos);

		}

	}

}
