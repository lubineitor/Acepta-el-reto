package aceptaelreto;

import java.io.*;

public class ElDiaDeNavidad_362 {
	
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			StringBuilder output = new StringBuilder();

			final int N = Integer.parseInt(reader.readLine());

			for (int i = 0; i < N; i++) {
				String[] fecha = reader.readLine().split(" ");
				final int dia = Integer.parseInt(fecha[0]);
				final int mes = Integer.parseInt(fecha[1]);

				if (dia == 25 && mes == 12) {
					output.append("SI\n");
				} else {
					output.append("NO\n");
				}
			}

			System.out.print(output);
		}
	}
}
