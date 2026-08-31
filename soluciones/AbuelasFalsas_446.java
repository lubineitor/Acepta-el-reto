package aceptaelreto;

import java.io.*;
import java.util.*;

public class AbuelasFalsas_446 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int casos = Integer.parseInt(br.readLine().trim());

		for (int c = 0; c < casos; c++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String nieto = st.nextToken();
			int numNietos = Integer.parseInt(st.nextToken());
			boolean abuelaFalsa = false;

			if (numNietos == 1) {
				pw.println("FALSA");
			} else {
				for (int i = 1; i < numNietos; i++) {
					String nietoActual = st.nextToken();
					if (nietoActual.equals(nieto)) {
						pw.println("FALSA");
						abuelaFalsa = true;
						break;
					}
				}
				if (!abuelaFalsa) {
					String ultimoNieto = st.hasMoreTokens() ? st.nextToken() : br.readLine().trim();
					if (ultimoNieto.equals(nieto)) {
						pw.println("VERDADERA");
					} else {
						pw.println("FALSA");
					}
				}
			}
		}

		pw.flush();
		pw.close();
	}
}