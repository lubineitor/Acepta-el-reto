package aceptaelreto;

import java.io.*;

public class MejorImposible_130 {

	public static void main(String[] args) {
		StringBuilder output = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String line;
			while ((line = reader.readLine()) != null) {
				int N = Integer.parseInt(line);
				if (N == 0) {
					break;
				}

				String[] coordinates = reader.readLine().split(" ");
				int x1 = Integer.parseInt(coordinates[0]);
				int y1 = Integer.parseInt(coordinates[1]);
				int x2 = Integer.parseInt(coordinates[2]);
				int y2 = Integer.parseInt(coordinates[3]);

				if ((x1 + y1) % 2 != (x2 + y2) % 2) {
					output.append("IMPOSIBLE\n");
				} else {
					if (x1 == x2 || y1 == y2 || Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
						output.append("1\n");
					} else {
						output.append("2\n");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(output.toString());
	}
}
