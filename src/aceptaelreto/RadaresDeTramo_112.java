package aceptaelreto;

import java.io.*;

public class RadaresDeTramo_112 {
	private static final double ONE_HOUR = 3600.0;
	private static final double ONE_KILOMETER = 1000.0;

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String line;

			while ((line = reader.readLine()) != null) {
				char[] chars = line.toCharArray();
				int index1 = 0, index2 = 0, index3 = 0;
				int spaceCount = 0;

				for (int i = 0; i < chars.length; i++) {
					if (chars[i] == ' ') {
						spaceCount++;
						if (spaceCount == 1)
							index1 = i + 1;
						else if (spaceCount == 2)
							index2 = i + 1;
					}
				}
				index3 = chars.length;

				if (spaceCount != 2) {
					System.out.println("ERROR: Se debe proporcionar exactamente tres valores por línea.");
					continue;
				}

				String metersStr = new String(chars, 0, index1 - 1).trim();
				String maxTimeStr = new String(chars, index1, index2 - index1 - 1).trim();
				String timeSecondsStr = new String(chars, index2, index3 - index2).trim();

				try {
					double meters = Double.parseDouble(metersStr);
					double maxTime = Double.parseDouble(maxTimeStr);
					double timeSeconds = Double.parseDouble(timeSecondsStr);

					if (meters == 0 && maxTime == 0 && timeSeconds == 0) {
						break;
					}

					if (meters <= 0 || maxTime <= 0 || timeSeconds <= 0) {
						System.out.println("ERROR");
					} else {
						double km = meters / ONE_KILOMETER;
						double timeHours = timeSeconds / ONE_HOUR;
						double medianTime = km / timeHours;

						if (medianTime < maxTime) {
							System.out.println("OK");
						} else {
							double delta = medianTime - maxTime;
							if (delta < 0.2 * maxTime) {
								System.out.println("MULTA");
							} else {
								System.out.println("PUNTOS");
							}
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("ERROR");
				}
			}
		} catch (IOException e) {
			System.out.println("ERROR: No se pudo leer la entrada.");
		}
	}
}