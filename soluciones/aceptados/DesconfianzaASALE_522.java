package aceptaelreto;

import java.io.*;

public class DesconfianzaASALE_522 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out, true);

		String word1, word2;
		int index1, index2;
		double charValue1, charValue2;
		boolean isFirstWordSmaller;

		String line;
		while ((line = reader.readLine()) != null) {

			String[] words = line.split(" ");

			if (words.length < 2) {
				continue;
			}

			word1 = words[0].toLowerCase();
			word2 = words[1].toLowerCase();

			isFirstWordSmaller = false;
			index1 = index2 = 0;

			while (true) {

				if (index1 > word1.length() - 1) {
					isFirstWordSmaller = true;
					break;
				}
				if (index2 > word2.length() - 1)
					break;

				if (index1 < word1.length() - 1) {
					if (word1.charAt(index1) == 'c' && word1.charAt(index1 + 1) == 'h') {
						charValue1 = ((double) 'c') + 0.5;
						index1++;
					} else if (word1.charAt(index1) == 'l' && word1.charAt(index1 + 1) == 'l') {
						charValue1 = ((double) 'l') + 0.5;
						index1++;
					} else {
						charValue1 = word1.charAt(index1);
					}
				} else {
					charValue1 = word1.charAt(index1);
				}

				if (index2 < word2.length() - 1) {
					if (word2.charAt(index2) == 'c' && word2.charAt(index2 + 1) == 'h') {
						charValue2 = ((double) 'c') + 0.5;
						index2++;
					} else if (word2.charAt(index2) == 'l' && word2.charAt(index2 + 1) == 'l') {
						charValue2 = ((double) 'l') + 0.5;
						index2++;
					} else {
						charValue2 = word2.charAt(index2);
					}
				} else {
					charValue2 = word2.charAt(index2);
				}

				if (charValue1 < charValue2) {
					isFirstWordSmaller = true;
					break;
				}
				if (charValue2 < charValue1)
					break;

				index1++;
				index2++;
			}

			writer.println(isFirstWordSmaller ? word1 : word2);
		}
	}
}