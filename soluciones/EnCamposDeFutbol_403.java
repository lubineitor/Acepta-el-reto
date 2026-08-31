package aceptaelreto;

import java.io.*;

public class EnCamposDeFutbol_403 {
	
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter writer = new PrintWriter(System.out)) {

			int casos = Integer.parseInt(reader.readLine());

			for (int i = 0; i < casos; i++) {
				String[] input = reader.readLine().split(" ");
				int area = Integer.parseInt(input[0]);
				int estimacion = Integer.parseInt(input[1]);

				int minEstimacion = estimacion * 4500;
				int maxEstimacion = estimacion * 10800;

				writer.println((area >= minEstimacion && area <= maxEstimacion) ? "SI" : "NO");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}