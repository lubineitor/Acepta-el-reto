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

					int[] cuentaColmillos = new int[10];
					long temp = i;

					while (temp > 0) {
						cuentaColmillos[(int) (temp % 10)]++;
						temp /= 10;
					}

					temp = j;
					while (temp > 0) {
						cuentaColmillos[(int) (temp % 10)]++;
						temp /= 10;
					}

					if (compararCuentas(cuentaOriginal, cuentaColmillos)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean compararCuentas(int[] cuenta1, int[] cuenta2) {
		for (int i = 0; i < 10; i++) {
			if (cuenta1[i] != cuenta2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int casos = Integer.parseInt(reader.readLine());

		for (int i = 0; i < casos; i++) {
			long numero = Long.parseLong(reader.readLine());
			if (esVampiro(numero)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}
}