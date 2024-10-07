package aceptaelreto;

import java.io.*;

public class NumerosVampiro_125 {

	private static int[] contarDigitos(long numero) {
		int[] cuenta = new int[10];
		while (numero > 0) {
			cuenta[(int) (numero % 10)]++;
			numero /= 10;
		}
		return cuenta;
	}

	public static boolean esVampiro(long numero) {
		String strNumero = Long.toString(numero);
		int longitud = strNumero.length();

		if (longitud % 2 != 0)
			return false;

		int mitad = longitud / 2;
		long limiteInferior = (long) Math.pow(10, mitad - 1);
		long limiteSuperior = (long) Math.pow(10, mitad);

		int[] cuentaOriginal = contarDigitos(numero);

		for (long factor1 = limiteInferior; factor1 < limiteSuperior; factor1++) {
			if (numero % factor1 == 0) {
				long factor2 = numero / factor1;

				if (factor2 >= limiteInferior && factor2 < limiteSuperior) {

					if (factor1 % 10 == 0 && factor2 % 10 == 0)
						continue;

					if (compararCuentas(cuentaOriginal, contarDigitos(factor1), contarDigitos(factor2))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean compararCuentas(int[] cuentaOriginal, int[] cuentaFactor1, int[] cuentaFactor2) {
		for (int i = 0; i < 10; i++) {
			if (cuentaOriginal[i] != cuentaFactor1[i] + cuentaFactor2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int casos = Integer.parseInt(reader.readLine());

		for (int i = 0; i < casos; i++) {
			long numero = Long.parseLong(reader.readLine());
			if (esVampiro(numero)) {
				writer.write("SI\n");
			} else {
				writer.write("NO\n");
			}
		}
		writer.flush();
	}
}
