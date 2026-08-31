package aceptaelreto;

import java.io.*;
import java.util.*;

public class HamburguesquinTLE2_421 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			String line;
			while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
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

				quickSort(restaurantes, 0, restaurantes.size() - 1);

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

	private static void quickSort(List<int[]> restaurantes, int low, int high) {
		if (low < high) {
			int pi = partition(restaurantes, low, high);

			quickSort(restaurantes, low, pi - 1);
			quickSort(restaurantes, pi + 1, high);
		}
	}

	private static int partition(List<int[]> restaurantes, int low, int high) {
		int[] pivot = restaurantes.get(high);
		int pivotStart = pivot[0] - pivot[1];
		int pivotEnd = pivot[0] + pivot[1];
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			int[] current = restaurantes.get(j);
			int currentStart = current[0] - current[1];
			int currentEnd = current[0] + current[1];

			if (currentStart < pivotStart || (currentStart == pivotStart && currentEnd <= pivotEnd)) {
				i++;
				Collections.swap(restaurantes, i, j);
			}
		}

		Collections.swap(restaurantes, i + 1, high);
		return i + 1;
	}
}
