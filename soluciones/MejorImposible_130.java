package aceptaelreto;

import java.io.*;

public class MejorImposible_130 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

		String line = reader.readLine();
		int size = Integer.parseInt(line);

		while (size != 0) {
			line = reader.readLine();
			String[] parts = line.split(" ");
			long startX = Long.parseLong(parts[0]);
			long startY = Long.parseLong(parts[1]);
			long endX = Long.parseLong(parts[2]);
			long endY = Long.parseLong(parts[3]);

			if (((startX + startY) % 2) != ((endX + endY) % 2)) {
				writer.println("IMPOSIBLE");
			}
			else if (startX == endX && startY == endY) {
				writer.println("0");
			}
			else if ((startX + startY == endX + endY) || (startX - startY == endX - endY)) {
				writer.println("1");
			}
			else {
				writer.println("2");
			}

			line = reader.readLine();
			size = Integer.parseInt(line);
		}

		reader.close();
		writer.close();
	}
}
