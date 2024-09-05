package aceptaelreto;

import java.io.*;
import java.util.*;

public class CamelCasi_558 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] claves;
		int numVariables;
		HashMap<String, StringBuilder> map = new HashMap<>();
		String variable, clave;
		StringBuilder sb;

		String line;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			numVariables = Integer.parseInt(line.trim());
			map.clear();
			claves = new String[numVariables];

			for (int i = 0; i < numVariables; i++) {
				variable = br.readLine();
				clave = variable.toUpperCase();
				claves[i] = clave;
				sb = map.get(clave);

				if (sb == null) {
					map.put(clave, new StringBuilder(variable));
				} else {
					for (int j = 0; j < variable.length(); j++) {
						if (variable.charAt(j) <= 'Z') {
							sb.setCharAt(j, variable.charAt(j));
						}
					}
					map.put(clave, sb);
				}
			}

			for (int i = 0; i < claves.length; i++) {
				pw.println(map.get(claves[i]));
			}
			pw.println("---");
		}

		pw.flush();
	}
}
