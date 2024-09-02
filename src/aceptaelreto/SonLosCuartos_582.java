package aceptaelreto;

import java.io.*;

public class SonLosCuartos_582 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int casos = Integer.parseInt(br.readLine().trim());

		for (int i = 0; i < casos; i++) {
			String[] partes = br.readLine().trim().split(" ");
			int campanadas = 0;

			if (partes[0].equals("ding-dong")) {
				pw.println("SALIDA NULA");
				continue;
			}

			for (String parte : partes) {
				if (parte.equals("ding-dong")) {
					pw.println("SALIDA NULA");
					break;
				} else if (parte.equals("doong")) {
					campanadas++;
				}
			}

			if (campanadas == 0) {
				pw.println("MARISA NARANJO");
			} else if (campanadas == 12) {
				pw.println("CORRECTO");
			} else if (campanadas < 12) {
				pw.println("TARDE");
			}
		}
		pw.flush();
		pw.close();
	}
}