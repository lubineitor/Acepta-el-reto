package aceptaelreto;

import java.util.*;

public class BloqueSeguro_760 {
	private static final int MOD = 1_000_000_007;

	private static long calculatePermutations(int n, int from, int to) {
		long currentPermutation = 1;

		for (int i = 0; i < from; i++) {
			currentPermutation = (currentPermutation * (n - i)) % MOD;
		}

		long sumOfPermutations = currentPermutation;

		for (int i = from; i < to; i++) {
			currentPermutation = (currentPermutation * (n - i)) % MOD;
			sumOfPermutations = (sumOfPermutations + currentPermutation) % MOD;
		}

		return sumOfPermutations;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfCases = scanner.nextInt();
		while (numberOfCases-- > 0) {
			int totalElements = scanner.nextInt();
			int startIndex = scanner.nextInt();
			int endIndex = scanner.nextInt();

			long totalPatterns = calculatePermutations(totalElements * totalElements, startIndex, endIndex);
			System.out.println(totalPatterns);
		}
		scanner.close();
	}
}
