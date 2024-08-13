package aceptaelreto;

import java.io.*;

public class PorElHuecoDeLaEscalera_540 {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			int casos = Integer.parseInt(reader.readLine());

			StringBuilder resultado = new StringBuilder();
			while (casos-- > 0) {
				String[] datos = reader.readLine().split(" ");

				int pisos = Integer.parseInt(datos[0]);
				int escalonesPiso = Integer.parseInt(datos[1]);
				int pisosBajados = Integer.parseInt(datos[2]);
				int extra = Integer.parseInt(datos[3]);

				int bajada = pisosBajados * escalonesPiso + extra;
				int subida = bajada + pisos * escalonesPiso;

				resultado.append(bajada).append(" ").append(subida).append("\n");
			}
			System.out.print(resultado.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}