package aceptaelreto;

import java.io.*;

public class ElOtroHijoDeBonacci_225 {
	
	private static final int MOD = 1_000_000_007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder output = new StringBuilder();
		String line;

		while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
			String[] parts = line.split(" ");
			int n = Integer.parseInt(parts[0]);
			int x = Integer.parseInt(parts[1]);
			int y = Integer.parseInt(parts[2]);

			long result = calculateFn(n, x, y);
			output.append(result).append("\n");
		}

		bw.write(output.toString());
		br.close();
		bw.close();
	}

	private static long[][] matrixMultiply(long[][] A, long[][] B) {
		long[][] C = new long[2][2];
		C[0][0] = (A[0][0] * B[0][0] + A[0][1] * B[1][0]) % MOD;
		C[0][1] = (A[0][0] * B[0][1] + A[0][1] * B[1][1]) % MOD;
		C[1][0] = (A[1][0] * B[0][0] + A[1][1] * B[1][0]) % MOD;
		C[1][1] = (A[1][0] * B[0][1] + A[1][1] * B[1][1]) % MOD;
		return C;
	}

	private static long[][] matrixPower(long[][] M, int power) {
		long[][] result = { { 1, 0 }, { 0, 1 } };
		long[][] base = M;

		while (power > 0) {
			if ((power & 1) == 1) {
				result = matrixMultiply(result, base);
			}
			base = matrixMultiply(base, base);
			power >>= 1;
		}

		return result;
	}

	private static long calculateFn(int n, int x, int y) {
		if (n == 0)
			return x % MOD;
		if (n == 1)
			return y % MOD;

		long[][] M = { { 1, 1 }, { 1, 0 } };

		long[][] Mn = matrixPower(M, n - 1);

		return (Mn[0][0] * y % MOD + Mn[0][1] * x % MOD) % MOD;
	}
}
