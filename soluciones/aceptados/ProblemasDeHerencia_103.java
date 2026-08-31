package aceptaelreto;

import java.util.*;
import java.io.*;

public class ProblemasDeHerencia_103 {

	private static double evaluatePolynomial(double x, int[] coefs) {
		double result = 0;
		for (int i = coefs.length - 1; i >= 0; i--) {
			result = result * x + coefs[i];
		}
		return result;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		try {
			int grado = Integer.parseInt(br.readLine().trim());

			while (grado != 20) {
				int[] coefs = new int[grado + 1];

				st = new StringTokenizer(br.readLine());
				for (int i = 0; i <= grado; ++i) {
					coefs[grado - i] = Integer.parseInt(st.nextToken());
				}

				int n = Integer.parseInt(br.readLine().trim());
				double area = 0;
				double h = 1.0 / n;

				for (int i = 0; i < n; ++i) {
					double x = i * h;
					double eval = evaluatePolynomial(x, coefs);

					if (eval < 0) {
						eval = 0;
					} else if (eval > 1) {
						eval = 1;
					}

					area += h * eval;
				}

				if (Math.abs(area - 0.5) < 0.0005) {
					System.out.println("JUSTO");
				} else if (area < 0.5) {
					System.out.println("ABEL");
				} else {
					System.out.println("CAIN");
				}

				grado = Integer.parseInt(br.readLine().trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}