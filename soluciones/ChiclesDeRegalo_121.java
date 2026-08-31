package aceptaelreto;

import java.io.*;

public class ChiclesDeRegalo_121 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			StringBuilder sb = new StringBuilder();

			String line;
			while ((line = br.readLine()) != null) {
				try {
					String[] inputs = line.split(" ");
					int envoltorios = Integer.parseInt(inputs[0]);
					int regalo = Integer.parseInt(inputs[1]);
					int chicles = Integer.parseInt(inputs[2]);

					if (envoltorios == 0 && regalo == 0 && chicles == 0) {
						break;
					}

					if (regalo >= envoltorios && chicles >= envoltorios) {
						sb.append("RUINA\n");
						continue;
					}

					if (regalo == 0) {
						sb.append(chicles).append(" ").append(chicles).append("\n");
						continue;
					}

					int contador = chicles;
					int envoltoriosRestantes = chicles;

					while (envoltoriosRestantes >= envoltorios) {
						int nuevosChicles = (envoltoriosRestantes / envoltorios) * regalo;
						envoltoriosRestantes = (envoltoriosRestantes % envoltorios) + nuevosChicles;
						contador += nuevosChicles;
					}

					sb.append(contador).append(" ").append(envoltoriosRestantes).append("\n");

				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}

			pw.print(sb.toString());
			pw.flush();

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
