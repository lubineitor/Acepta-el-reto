package aceptaelreto;

import java.io.*;
import java.math.*;

public class SumaleUno_163 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out))) {

			String line;
			while ((line = br.readLine()) != null) {
				if (line.equals("FIN")) {
					break;
				}

				BigInteger decimalValue = new BigInteger(line, 16);

				decimalValue = decimalValue.add(BigInteger.ONE);

				String nextHex = decimalValue.toString(16).toUpperCase();
				pw.println(nextHex);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
