package aceptaelreto;

import java.io.*;
import java.util.*;

public class AbadiasPirenaicas_171 {
	
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out))) {

			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				int casos = Integer.parseInt(st.nextToken());

				if (casos == 0) {
					break;
				}

				ArrayList<Integer> montanas = new ArrayList<>();

				for (int i = 0; i < casos; i++) {
					int abadia = Integer.parseInt(st.nextToken());
					boolean valido = true;

					for (int j = montanas.size() - 1; j >= 0 && valido; j--) {
						if (montanas.get(j) <= abadia) {
							montanas.remove(j);
						} else {
							valido = false;
						}
					}
					montanas.add(abadia);
				}
				pw.println(montanas.size());
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
