package aceptaelreto;

import java.io.*;

public class EscudosDelEjercitoRomano_119 {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputLine;

		while ((inputLine = reader.readLine()) != null) {
			int ejercito = Integer.parseInt(inputLine);
			if (ejercito == 0)
				break;

			int total = 0;
			while (ejercito > 0) {
				if (ejercito < 4) {
					total += ejercito * 5;
					break;
				}

				int temp = (int) Math.sqrt(ejercito);
				ejercito -= temp * temp;

				total += (temp - 2) * (temp - 2);
				total += ((temp - 2) * 4) * 2 + 12;
			}
			System.out.println(total);
		}
	}
}