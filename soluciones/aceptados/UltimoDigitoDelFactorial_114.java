package aceptaelreto;

import java.io.*;

public class UltimoDigitoDelFactorial_114 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(reader.readLine());

		StringBuilder output = new StringBuilder();
		for (int i = 0; i < casos; i++) {
			int n = Integer.parseInt(reader.readLine());
			if (n >= 5) {
				output.append('0').append('\n');
			} else if (n == 0 || n == 1) {
				output.append('1').append('\n');
			} else if (n == 2) {
				output.append('2').append('\n');
			} else if (n == 3) {
				output.append('6').append('\n');
			} else if (n == 4) {
				output.append('4').append('\n');
			}
		}
		System.out.print(output);
	}
}