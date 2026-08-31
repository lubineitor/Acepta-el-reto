package aceptaelreto;

import java.io.*;

public class SendaPirenaica_485 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();

		int numeroEtapas;
		int[] distanciaEtapa;
		int total;

		String linea;
		while (!(linea = br.readLine()).equals("0")) {
			numeroEtapas = Integer.parseInt(linea);
			distanciaEtapa = new int[numeroEtapas];
			total = 0;

			String[] distancias = br.readLine().split(" ");
			for (int i = 0; i < numeroEtapas; i++) {
				distanciaEtapa[i] = Integer.parseInt(distancias[i]);
				total += distanciaEtapa[i];
			}

			sb.append(total);
			for (int i = 1; i < numeroEtapas; i++) {
				total -= distanciaEtapa[i - 1];
				sb.append(" ").append(total);
			}
			sb.append("\n");
		}

		pw.print(sb.toString());
		pw.flush();
	}
}
