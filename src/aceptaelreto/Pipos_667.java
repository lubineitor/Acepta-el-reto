package aceptaelreto;

import java.io.*;

public class Pipos_667 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {
			while (true) {
				String year = br.readLine();

				if (year.equals("0")) {
					break;
				}

				String[] input = br.readLine().split(" ");
				int[] stock = new int[10];
				for (int i = 0; i < 10; i++) {
					stock[i] = Integer.parseInt(input[i]);
				}

				int[] digitCount = new int[10];
				for (char c : year.toCharArray()) {
					if (Character.isDigit(c)) {
						digitCount[c - '0']++;
					}
				}

				int minPipos = Integer.MAX_VALUE;

				for (int i = 0; i < 10; i++) {
					if (digitCount[i] > 0) {
						int piposPorDigito = stock[i] / digitCount[i];
						minPipos = Math.min(minPipos, piposPorDigito);
					}
				}

				pw.println(minPipos == Integer.MAX_VALUE ? 0 : minPipos / 3);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
