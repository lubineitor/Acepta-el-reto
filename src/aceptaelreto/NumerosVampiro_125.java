package aceptaelreto;

import java.io.*;

public class NumerosVampiro_125 {

	private static int[] contarDigitos(long numero) {
		int[] cuenta = new int[10];
		String strNumero = Long.toString(numero);
		for (char c : strNumero.toCharArray()) {
			cuenta[c - '0']++;
		}
		return cuenta;
	}

	public static boolean esVampiro(long numero) {
		String strNumero = Long.toString(numero);
		int n = strNumero.length();

		if (n % 2 != 0)
			return false;

		int[] cuentaOriginal = contarDigitos(numero);
		int mitad = n / 2;

		long limiteInferior = (long) Math.pow(10, mitad - 1);
		long limiteSuperior = (long) Math.pow(10, mitad);

		for (long i = limiteInferior; i < limiteSuperior; i++) {
			if (numero % i == 0) {
				long j = numero / i;

				if (j >= limiteInferior && j < limiteSuperior) {

					if (i % 10 == 0 && j % 10 == 0)
						continue;

					if (compararCuentas(cuentaOriginal, contarDigitos(i), contarDigitos(j))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean compararCuentas(int[] cuentaOriginal, int[] cuentaColmillo1, int[] cuentaColmillo2) {
		int[] cuentaTotal = new int[10];

		for (int i = 0; i < 10; i++) {
			cuentaTotal[i] = cuentaColmillo1[i] + cuentaColmillo2[i];
		}

		for (int i = 0; i < 10; i++) {
			if (cuentaOriginal[i] != cuentaTotal[i]) {
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
