package aceptaelreto;

import java.io.*;

public class LasCartasDelAbuelo_132 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		StringBuilder output = new StringBuilder();

		String line;

		while ((line = reader.readLine()) != null) {
			if (line.equals(""))
				continue;

			String text = line;
			int n = Integer.parseInt(reader.readLine());

			if (n == 0)
				break;

			for (int i = 0; i < n; i++) {
				String[] interval = reader.readLine().split(" ");
				int start = Integer.parseInt(interval[0]);
				int end = Integer.parseInt(interval[1]);

				int min = Math.min(start, end);
				int max = Math.max(start, end);

				boolean areAllCharsEqual = true;
				char firstChar = text.charAt(min);

				for (int j = min + 1; j <= max; j++) {
					if (text.charAt(j) != firstChar) {
						areAllCharsEqual = false;
						break;
					}
				}

				if (areAllCharsEqual) {
					output.append("SI\n");
				} else {
					output.append("NO\n");
				}
			}

			output.append("\n");
		}

		writer.print(output.toString());
		writer.flush();
	}
}