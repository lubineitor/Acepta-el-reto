package aceptaelreto;

import java.util.*;

public class EncriptacionDeMensajes_102 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] esVocal = new boolean[128];
		esVocal['a'] = true;
		esVocal['e'] = true;
		esVocal['i'] = true;
		esVocal['o'] = true;
		esVocal['u'] = true;
		esVocal['A'] = true;
		esVocal['E'] = true;
		esVocal['I'] = true;
		esVocal['O'] = true;
		esVocal['U'] = true;

		while (true) {
			String input = sc.nextLine();
			int desplazamiento = input.charAt(0) - 'p';

			int vocales = 0;

			if (input.length() == 4) {
				char c1 = (char) ((input.charAt(1) - 'A' - desplazamiento + 26) % 26 + 'A');
				char c2 = (char) ((input.charAt(2) - 'A' - desplazamiento + 26) % 26 + 'A');
				char c3 = (char) ((input.charAt(3) - 'A' - desplazamiento + 26) % 26 + 'A');
				if (c1 == 'F' && c2 == 'I' && c3 == 'N') {
					break;
				}
			}

			for (int i = 1; i < input.length(); i++) {
				char c = input.charAt(i);

				if (c >= 'A' && c <= 'Z') {
					c = (char) ((c - 'A' - desplazamiento + 26) % 26 + 'A');
				} else if (c >= 'a' && c <= 'z') {
					c = (char) ((c - 'a' - desplazamiento + 26) % 26 + 'a');
				}

				if (esVocal[c]) {
					vocales++;
				}
			}
			System.out.println(vocales);
		}
		sc.close();
	}
}