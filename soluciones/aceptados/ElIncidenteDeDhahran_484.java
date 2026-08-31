package aceptaelreto;

import java.io.*;

public class ElIncidenteDeDhahran_484 {

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(System.out, true)) { // 'true' activa el auto-flush

			String caso;
			while ((caso = br.readLine()) != null) {
				int dotIndex = caso.indexOf('.');

				int startIndex = 0;
				while (startIndex < caso.length() && caso.charAt(startIndex) == '0') {
					startIndex++;
				}

				if (dotIndex == -1) {
					if (startIndex == caso.length()) {
						out.println("0");
					} else {
						out.println(caso.substring(startIndex));
					}
				} else {
					if (startIndex == dotIndex) {
						out.print("0");
					} else {
						out.print(caso.substring(startIndex, dotIndex));
					}

					int endIndex = caso.length() - 1;
					while (endIndex > dotIndex && caso.charAt(endIndex) == '0') {
						endIndex--;
					}

					if (endIndex > dotIndex) {
						out.println(caso.substring(dotIndex, endIndex + 1));
					} else {
						out.println();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
