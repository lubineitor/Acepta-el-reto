package aceptaelreto;

import java.io.*;

public class NumeroDeKaprekar_115 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int num;
		int left;
		int right;
		int decima;
		int suma;
		boolean kaprekar;

		num = Integer.parseInt(br.readLine());

		while (num != 0) {

			decima = 1;
			left = 0;
			right = 0;
			suma = 0;
			kaprekar = false;

			left = num * num;

			while (left > 0 && !kaprekar) {

				right = right + (left % 10) * decima;
				left /= 10;
				decima *= 10;

				suma = left + right;

				if (right > 0 && suma == num) {
					kaprekar = true;
				}
			}

			if (kaprekar) {
				pw.println("SI");
			} else {
				pw.println("NO");
			}

			num = Integer.parseInt(br.readLine());
		}

		pw.close();
		br.close();
	}
}
