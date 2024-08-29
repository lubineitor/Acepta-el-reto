
package aceptaelreto;

import java.io.*;

public class LasDimensionesDelPuzzle_402 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String line = reader.readLine();
			int n = Integer.parseInt(line.trim());

			if (n == 0) {
				break;
			}

			int bestSide = 0;
			int minDiff = Integer.MAX_VALUE;

			for (int i = 1; i * i <= n; i++) {
				if (n % i == 0) {
					int j = n / i;
					int maxSide = Math.max(i, j);
					int diff = Math.abs(i - j);

					if (diff < minDiff || (diff == minDiff && maxSide < bestSide)) {
						bestSide = maxSide;
						minDiff = diff;
					}
				}
			}

			writer.write(bestSide + "\n");
		}

		writer.flush();
	}
}
