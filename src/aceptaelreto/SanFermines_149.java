package aceptaelreto;

import java.io.*;

public class SanFermines_149 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			String[] numbers = line.trim().split(" ");
			int total = Integer.parseInt(numbers[0]);

			int mayor = 0;

			if (total >= 1 && numbers.length == total + 1) {

				for (int i = 1; i <= total; i++) {
					int num = Integer.parseInt(numbers[i]);
					if (num > mayor) {
						mayor = num;
					}
				}

				pw.println(mayor);
			}
		}

		pw.flush();
		pw.close();
	}
}