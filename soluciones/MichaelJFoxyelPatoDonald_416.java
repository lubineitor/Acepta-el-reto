package aceptaelreto;

import java.io.*;
import java.util.*;

public class MichaelJFoxyelPatoDonald_416 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out)) {

			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.isEmpty()) {
					continue;
				}

				int numFechas;
				try {
					numFechas = Integer.parseInt(line);
				} catch (NumberFormatException e) {
					continue;
				}

				if (numFechas == 0) {
					break;
				}

				HashSet<String> fechas = new HashSet<>();
				boolean foundDuplicate = false;

				String[] fechaArray = br.readLine().trim().split(" ");
				for (String fecha : fechaArray) {
					if (fecha.length() >= 5) {
						fecha = fecha.substring(0, fecha.length() - 5);
					}

					if (!fechas.add(fecha)) {
						foundDuplicate = true;
					}
				}

				if (foundDuplicate) {
					pw.println("SI");
				} else {
					pw.println("NO");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}