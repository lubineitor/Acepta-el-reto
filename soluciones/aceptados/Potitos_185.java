package aceptaelreto;

import java.io.*;
import java.util.*;

public class Potitos_185 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;

		while (!(line = br.readLine()).equals("0")) {
			int casos = Integer.parseInt(line);

			Set<String> gustan = new HashSet<>();
			Set<String> noGustan = new TreeSet<>();

			for (int i = 0; i < casos; i++) {
				String[] parts = br.readLine().split(" ");
				boolean like = parts[0].equals("SI:");

				for (int j = 1; j < parts.length; j++) {
					if (parts[j].equals("FIN"))
						break;
					if (like) {
						gustan.add(parts[j]);
					} else if (!gustan.contains(parts[j])) {
						noGustan.add(parts[j]);
					}
				}
			}

			noGustan.removeAll(gustan);

			if (!noGustan.isEmpty()) {
				StringBuilder sb = new StringBuilder();
				for (String item : noGustan) {
					if (sb.length() > 0) {
						sb.append(" ");
					}
					sb.append(item);
				}
				pw.println(sb.toString());
			} else {
				pw.println();
			}
		}

		pw.flush();
	}
}