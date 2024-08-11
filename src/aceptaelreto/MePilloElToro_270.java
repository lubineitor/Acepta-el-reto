package aceptaelreto;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MePilloElToro_270 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos;
		String nombre, correcion;
		TreeMap<String, Integer> map = new TreeMap();

		while ((casos = sc.nextInt()) != 0) {
			sc.nextLine();
			map.clear();
			while (casos-- > 0) {
				nombre = sc.nextLine();
				correcion = sc.nextLine();
				if (map.containsKey(nombre)) {
					if (correcion.equals("CORRECTO")) {
						map.put(nombre, map.get(nombre) + 1);
					} else {
						map.put(nombre, map.get(nombre) - 1);
					}
				} else {
					if (correcion.equals("CORRECTO")) {
						map.put(nombre, 1);
					} else {
						map.put(nombre, -1);
					}
				}
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			if ((int) entry.getValue() != 0) {
				System.out.println(entry.getKey() + ", " + entry.getValue());
			}
			System.out.println("---");
		}
	}

}
