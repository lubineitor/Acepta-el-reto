package aceptaelreto;

import java.io.*;

public class LaAbuelaMaria_337 {

	public static void main(String[] args) throws IOException {
		final int DIENTES = 6;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();

		int casos = Integer.parseInt(br.readLine());

		while (casos-- > 0) {
			String[] arriba = br.readLine().split(" ");
			String[] abajo = br.readLine().split(" ");

			int suma = Integer.parseInt(arriba[0]) + Integer.parseInt(abajo[0]);
			boolean hueco = false;

			for (int i = 1; i < DIENTES; i++) {
				if (suma != Integer.parseInt(arriba[i]) + Integer.parseInt(abajo[i])) {
					hueco = true;
					break;
				}
			}

			if (hueco) {
				sb.append("NO\n");
			} else {
				sb.append("SI\n");
			}
		}

		pw.print(sb.toString());
		pw.flush();
		pw.close();
		br.close();
	}
}