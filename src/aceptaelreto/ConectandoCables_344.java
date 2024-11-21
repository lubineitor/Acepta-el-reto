package aceptaelreto;

import java.io.*;

public class ConectandoCables_344 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int casosPrueba = Integer.parseInt(reader.readLine().trim());

		for (int i = 0; i < casosPrueba; i++) {
			reader.readLine();
			String cables = reader.readLine().trim();

			int macho = 0;
			int hembra = 0;

			for (int j = 0; j < cables.length(); j++) {
				char conector = cables.charAt(j);
				if (conector == 'M') {
					macho++;
				} else if (conector == 'H') {
					hembra++;
				}
			}

			if (macho == hembra) {
				System.out.println("POSIBLE");
			} else {
				System.out.println("IMPOSIBLE");
			}
		}
	}
}
