package aceptaelreto;

import java.io.*;
import java.util.*;

public class HamburguesquinTLE_421 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			String line;
			while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
				// Leer L y N
				String[] firstLine = line.trim().split(" ");
				long L = Long.parseLong(firstLine[0]);
				int N = Integer.parseInt(firstLine[1]);

				if (N == 0) {
					pw.println(-1);
					continue;
				}

				List<int[]> restaurantes = new ArrayList<>();
				for (int i = 0; i < N; i++) {
					String[] datos = br.readLine().trim().split(" ");
					int xi = Integer.parseInt(datos[0]);
					int ri = Integer.parseInt(datos[1]);
					restaurantes.add(new int[] { xi, ri });
				}

				for (int i = 0; i < restaurantes.size(); i++) {
					for (int j = i + 1; j < restaurantes.size(); j++) {
						int[] a = restaurantes.get(i);
						int[] b = restaurantes.get(j);
						int startA = a[0] - a[1];
						int startB = b[0] - b[1];
						int endA = a[0] + a[1];
						int endB = b[0] + b[1];
						if (startA > startB || (startA == startB && endA > endB)) {
							int[] temp = restaurantes.get(i);
							restaurantes.set(i, restaurantes.get(j));
							restaurantes.set(j, temp);
						}
					}
				}

				long cubiertoHasta = 0;
				int idx = 0;
				int necesarios = 0;
				boolean posible = true;

				while (cubiertoHasta < L) {
					long mejorFin = cubiertoHasta;

					while (idx < restaurantes.size()
							&& (restaurantes.get(idx)[0] - restaurantes.get(idx)[1]) <= cubiertoHasta) {
						mejorFin = Math.max(mejorFin, restaurantes.get(idx)[0] + restaurantes.get(idx)[1]);
						idx++;
					}

					if (mejorFin == cubiertoHasta) {
						posible = false;
						break;
					}

					necesarios++;
					cubiertoHasta = mejorFin;
				}

				pw.println(posible ? (N - necesarios) : -1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
