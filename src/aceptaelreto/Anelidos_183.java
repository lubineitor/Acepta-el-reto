package aceptaelreto;

import java.io.*;

public class Anelidos_183 {

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

		StringBuilder result = new StringBuilder();

		for (char ring : rings.toCharArray()) {
			generateExpandedRing(result, ring, phases);
		}

		result.append(head);

		return result.toString();
	}

	private static void generateExpandedRing(StringBuilder result, char ring, int phases) {
		if (phases == 0) {
			result.append(ring);
		} else if (ring == 'A') {
			generateExpandedRing(result, 'A', phases - 1);
			generateExpandedRing(result, 'N', phases - 1);
		} else if (ring == 'N') {
			generateExpandedRing(result, 'N', phases - 1);
			generateExpandedRing(result, 'A', phases - 1);
		}
	}
}