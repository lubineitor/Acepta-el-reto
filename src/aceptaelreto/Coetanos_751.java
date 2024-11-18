package aceptaelreto;

import java.io.*;

public class Coetanos_751 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			int casos = Integer.parseInt(br.readLine());

			for (int i = 0; i < casos; i++) {
				String[] datos = br.readLine().split(" ");
				int nacimiento1 = Integer.parseInt(datos[0]);
				int muerte1 = Integer.parseInt(datos[1]);
				int nacimiento2 = Integer.parseInt(datos[2]);
				int muerte2 = Integer.parseInt(datos[3]);

				int inicioCoincidencia = Math.max(nacimiento1, nacimiento2);
				int finCoincidencia = Math.min(muerte1, muerte2);

				int aniosCoincidencia = Math.max(0, finCoincidencia - inicioCoincidencia + 1);

				pw.println(aniosCoincidencia);
			}

			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
