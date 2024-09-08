package aceptaelreto;

import java.io.*;

public class Loginlogout_529 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();

		int casos = Integer.parseInt(br.readLine());

		for (int c = 0; c < casos; c++) {
			String reg = br.readLine();
			int input = 0, max = 0;

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
			sb.append(max).append("\n");
		}

		pw.print(sb.toString());
		pw.flush();
		pw.close();
	}
}
