package aceptaelreto;

import java.util.*;

public class MePilloElToro_270 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> map = new TreeMap<>();

		while (true) {
			int casos = sc.nextInt();
			if (casos == 0)
				break;

			sc.nextLine();
			map.clear();

			for (int i = 0; i < casos; i++) {
				String nombre = sc.nextLine();
				String correccion = sc.nextLine();

				int valor = correccion.equals("CORRECTO") ? 1 : -1;
				map.put(nombre, map.getOrDefault(nombre, 0) + valor);
			}

			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() != 0) {
					System.out.println(entry.getKey() + ", " + entry.getValue());
				}
			}
			System.out.println("---");
		}

		sc.close();
	}
}
