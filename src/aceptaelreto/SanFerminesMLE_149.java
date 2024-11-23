package aceptaelreto;

import java.io.*;

public class SanFerminesMLE_149 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			String line;
			while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
				String[] inputs = line.trim().split("\\s+");

				int total;
				try {
					total = Integer.parseInt(inputs[0]);
				} catch (NumberFormatException e) {
					continue;
				}

				if (inputs.length != total + 1) {
					continue;
				}

				int mayor = Integer.MIN_VALUE;
				try {
					for (int i = 1; i <= total; i++) {
						int num = Integer.parseInt(inputs[i]);
						if (num > mayor) {
							mayor = num;
						}
					}
				} catch (NumberFormatException e) {
					continue;
				}

				pw.println(mayor);
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}