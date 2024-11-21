package aceptaelreto;

import java.io.*;

public class PepeCasanova_599 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int N = Integer.parseInt(br.readLine().trim());

			if (N == 0)
				break;

			int ladoA = Integer.parseInt(br.readLine().trim());

			int[] duraciones = new int[N];
			int[] puntajes = new int[N];

			for (int i = 0; i < N; i++) {
				String[] line = br.readLine().split(" ");
				duraciones[i] = Integer.parseInt(line[0].trim());
				puntajes[i] = Integer.parseInt(line[1].trim());
			}

			int ladoB = ladoA;

			System.out.println(maxPuntajeCinta(N, ladoA, ladoB, duraciones, puntajes));
		}
	}

	public static int maxPuntajeCinta(int N, int ladoA, int ladoB, int[] duraciones, int[] puntajes) {
		int[][] dp = new int[ladoA + 1][ladoB + 1];

		for (int k = 0; k < N; k++) {
			int dur = duraciones[k];
			int puntaje = puntajes[k];
			for (int i = ladoA; i >= 0; i--) {
				for (int j = ladoB; j >= 0; j--) {
					if (i >= dur) {
						dp[i][j] = Math.max(dp[i][j], dp[i - dur][j] + puntaje);
					}
					if (j >= dur) {
						dp[i][j] = Math.max(dp[i][j], dp[i][j - dur] + puntaje);
					}
				}
			}
		}

		return dp[ladoA][ladoB];
	}
}