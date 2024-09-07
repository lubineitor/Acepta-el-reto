package aceptaelreto;

import java.io.*;

public class Esgritura_438 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();

		String linea;
		int letras, signos;
		char letra;

		while ((linea = br.readLine()) != null && !linea.isEmpty()) {
			letras = 0;
			signos = 0;

			for (int i = 0; i < linea.length(); i++) {
				letra = linea.charAt(i);
				if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
					letras++;
				}
				else if (letra == '!') {
					signos++;
				}
			}

			if (signos > letras) {
				sb.append("ESGRITO\n");
			} else {
				sb.append("escrito\n");
			}
		}

		pw.print(sb.toString());

		pw.flush();
		pw.close();
	}
}
