package aceptaelreto;

import java.io.*;

public class Ventas_105 {
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] nombreDias = { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };
		StringBuilder outputBuilder = new StringBuilder();

		try {
			String line;
			while ((line = reader.readLine().trim()) != null) {
				double[] valores = new double[6];
				double valor = Double.parseDouble(line);

				if (valor == -1) {
					break;
				}

				valores[0] = valor;
				double maxVal = valor;
				double minVal = valor;
				int diaMax = 0, diaMin = 0;
				double suma = valor;

				for (int i = 1; i < 6; ++i) {
					valor = Double.parseDouble(reader.readLine().trim());
					valores[i] = valor;
					suma += valor;

					if (valor > maxVal) {
						maxVal = valor;
						diaMax = i;
					}
					if (valor < minVal) {
						minVal = valor;
						diaMin = i;
					}
				}

				double media = suma / 6;

				outputBuilder.append(nombreDias[diaMax]).append(' ').append(nombreDias[diaMin]).append(' ')
						.append(valores[5] > media ? "SI" : "NO").append('\n');
			}
			System.out.print(outputBuilder.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}