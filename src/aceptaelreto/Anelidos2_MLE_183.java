package aceptaelreto;

import java.io.*;

public class Anelidos2_MLE_183 {
	
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter writer = new PrintWriter(System.out)) {

			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(" ");
				int phases = Integer.parseInt(parts[0]);
				String configuration = parts[1];

				if (configuration.equals("C")) {
					break;
				}

				String result = simulateGrowth(phases, configuration);

				writer.println(result);
			}

			writer.flush();
		}
	}

	private static String simulateGrowth(int phases, String configuration) {
		String rings = configuration.substring(0, configuration.length() - 1);
		char head = configuration.charAt(configuration.length() - 1);

		for (int i = 0; i < phases; i++) {
			rings = grow(rings);
		}

		return rings + head;
	}

	private static String grow(String rings) {
		StringBuilder newRings = new StringBuilder();

		for (char ring : rings.toCharArray()) {
			if (ring == 'A') {
				newRings.append("AN");
			} else if (ring == 'N') {
				newRings.append("NA");
			}
		}

		return newRings.toString();
	}
}