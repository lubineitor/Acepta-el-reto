package aceptaelreto;

import java.io.*;
import java.util.*;

public class EvitandoTropiezosMLE_688 {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String headerLine;
			while ((headerLine = br.readLine()) != null) {
				headerLine = headerLine.trim();
				if (headerLine.isEmpty()) {
					continue;
				}

				StringTokenizer headerTokens = new StringTokenizer(headerLine);
				int c = Integer.parseInt(headerTokens.nextToken());
				int m = Integer.parseInt(headerTokens.nextToken());
				int n = Integer.parseInt(headerTokens.nextToken());

				String heightsLine = br.readLine();
				if (heightsLine == null || heightsLine.trim().isEmpty()) {
					break;
				}
				StringTokenizer heightTokens = new StringTokenizer(heightsLine);

				int previousHeight = Integer.parseInt(heightTokens.nextToken());
				boolean esValida = true;
				int previousDiff = 0;
				int minDiff = Integer.MAX_VALUE;
				int maxDiff = Integer.MIN_VALUE;

				for (int i = 0; i < n; i++) {
					int currentHeight = Integer.parseInt(heightTokens.nextToken());
					int diff = currentHeight - previousHeight;

					if (i > 0 && Math.abs(diff - previousDiff) > c) {
						esValida = false;
					}

					minDiff = Math.min(minDiff, diff);
					maxDiff = Math.max(maxDiff, diff);

					previousDiff = diff;
					previousHeight = currentHeight;
				}

				if (maxDiff - minDiff > m) {
					esValida = false;
				}

				System.out.println(esValida ? "Ok" : "Tropiezo");
			}
		}
	}
}
