package aceptaelreto;

import java.io.*;

public class TravesurasEnElHotelDeHilbert_800 {

	static boolean isPerfectSquare(long n) {
		long r = (long) Math.sqrt(n);
		return r * r == n || (r + 1) * (r + 1) == n;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line;

		while ((line = br.readLine()) != null) {
			line = line.trim();
			if (line.isEmpty())
				break;

			String[] tokens = line.split("\\s+");
			for (String token : tokens) {
				long num = Long.parseLong(token);
				sb.append(isPerfectSquare(num) ? "ENCENDIDA" : "APAGADA").append('\n');
			}
		}

		System.out.print(sb.toString());
	}
}