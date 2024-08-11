package aceptaelreto;

import java.util.Scanner;

public class Loginlogout_529 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		int input, max;
		String reg;

		for (; casos > 0; casos--) {
			input = 0;
			max = 0;
			reg = sc.nextLine();

			for (int i = 0; i < reg.length(); i++) {
				if (reg.charAt(i) == 'I') {
					input++;
					if (input > max) {
						max = input;
					}
				} else if (input > 0) {
					input--;
				} else {
					max++;
				}
			}
			System.out.println(max);
		}

	}

}
