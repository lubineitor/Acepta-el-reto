package aceptaelreto;

import java.io.*;

public class DivisoresDelFactorial_126 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter writer = new PrintWriter(System.out)) {

			while (true) {
				String[] input = reader.readLine().split(" ");
				int p = Integer.parseInt(input[0]);
				int n = Integer.parseInt(input[1]);

				if (p < 0 && n < 0) {
					break;
				}

				if (p <= n) {
					writer.println("YES");
				} else {
					writer.println("NO");
				}
			}

			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}