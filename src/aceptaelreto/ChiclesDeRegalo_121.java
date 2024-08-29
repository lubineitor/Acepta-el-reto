package aceptaelreto;

import java.io.*;

public class ChiclesDeRegalo_121 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();

		String line;
		while ((line = br.readLine()) != null) {
			String[] inputs = line.split(" ");
			int envoltorios = Integer.parseInt(inputs[0]);
			int regalo = Integer.parseInt(inputs[1]);
			int chicles = Integer.parseInt(inputs[2]);

			if (envoltorios == 0 && regalo == 0 && chicles == 0) {
				break;
			}
			if (regalo >= envoltorios && chicles >= envoltorios) {
				sb.append("RUINA\n");
			} else if (regalo == 0) {
				sb.append(chicles).append(" ").append(chicles).append("\n");
			} else {
				int contador = 0;
				int envoltoriosRestantes = 0;
				while ((chicles + envoltoriosRestantes) >= envoltorios) {
					contador += chicles;

					int chiclesAnterior = chicles;
					chicles = (chicles + envoltoriosRestantes) / envoltorios * regalo;
					envoltoriosRestantes = (chiclesAnterior + envoltoriosRestantes) % envoltorios;
				}
				contador += chicles;
				envoltoriosRestantes += chicles;
				sb.append(contador).append(" ").append(envoltoriosRestantes).append("\n");
			}
		}

		pw.print(sb.toString());
		pw.flush();
		pw.close();
	}
}
