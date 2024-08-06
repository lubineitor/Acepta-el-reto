package aceptaelreto;

import java.util.Scanner;

public class Pipos_667 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String year = sc.nextLine();
			if (year.equals("0")) {
				break;
			}
			int[] digits = new int[10];
			for (int i = 0; i < 10; i++) {
				digits[i] = sc.nextInt();
			}
			sc.nextLine();
			int[] counts = new int[10];
			for (char c : year.toCharArray()) {
				if (Character.isDigit(c)) {
					counts[c - '0']++;
				}
			}
			int minValue = Integer.MAX_VALUE;
			for (int i = 0; i < 10; i++) {
				if (counts[i] > 0) {
					digits[i] /= counts[i];
					minValue = Math.min(minValue, digits[i]);
				}
			}
			System.out.println(minValue == Integer.MAX_VALUE ? 0 : minValue / 3);
		}
		sc.close();
	}
}
