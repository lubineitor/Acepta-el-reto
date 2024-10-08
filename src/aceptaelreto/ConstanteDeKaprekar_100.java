package aceptaelreto;

import java.util.*;

public class ConstanteDeKaprekar_100 {

	public static int kaprekarRoutine(int num) {
		if (num == 6174) {
			return 0;
		}

		char[] digits = String.format("%04d", num).toCharArray();

		int iterations = 0;

		while (num != 6174) {
			Arrays.sort(digits);
			int asc = Integer.parseInt(new String(digits));
			int desc = Integer.parseInt(new StringBuilder(new String(digits)).reverse().toString());

			num = desc - asc;
			digits = String.format("%04d", num).toCharArray();

			iterations++;

			if (num == 0) {
				return 8;
			}
		}

		return iterations;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();

		for (int i = 0; i < testCases; i++) {
			int num = sc.nextInt();

			System.out.println(kaprekarRoutine(num));
		}

		sc.close();
	}
}
