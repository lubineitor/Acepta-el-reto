package aceptaelreto;

import java.io.*;

public class SumaDeDigitos_140 {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			String total;

			while ((total = br.readLine()) != null) {
				if (total.charAt(0) == '-') {
					break;
				}

				int suma = 0;
				StringBuilder output = new StringBuilder(total.length() * 4);

				for (int i = 0; i < total.length(); i++) {
					int digito = total.charAt(i) - '0';
					suma += digito;

					output.append(digito).append(" + ");
				}

				output.setLength(output.length() - 3);
				output.append(" = ").append(suma);

				pw.println(output);
			}

			pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}