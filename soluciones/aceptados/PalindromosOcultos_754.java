package aceptaelreto;

import java.util.*;
import java.io.*;

public class PalindromosOcultos_754 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputLine;

		while ((inputLine = reader.readLine()) != null && !inputLine.isEmpty()) {
			System.out.println(generatePalindrome(inputLine));
		}
	}

	private static String generatePalindrome(String word) {
		int[] letterCounts = new int[26];
		for (char c : word.toCharArray()) {
			letterCounts[c - 'a']++;
		}

		int oddCount = 0;
		int oddIndex = -1;

		for (int i = 0; i < 26; i++) {
			if (letterCounts[i] % 2 != 0) {
				oddCount++;
				oddIndex = i;
			}
		}

		if (oddCount > 1) {
			return "NO HAY";
		}

		StringBuilder half = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char[] chars = new char[letterCounts[i] / 2];
			Arrays.fill(chars, (char) (i + 'a'));
			half.append(chars);
		}

		StringBuilder palindrome = new StringBuilder(half);
		if (oddIndex != -1) {
			palindrome.append((char) (oddIndex + 'a'));
		}

		palindrome.append(half.reverse());
		return palindrome.toString();
	}
}
