package aceptaelreto;

import java.io.*;

public class Estrofas_110 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String vocales = "aeiou";
	static String alfabeto = "abcdefghijklmnñopqrstuvwxyz";

	public static void main(String[] args) throws IOException {
		String line;
		while ((line = br.readLine()) != null) {
			int numVersos = Integer.parseInt(line);
			if (numVersos == 0) {
				break;
			}
			String[] versos = leerVersos(numVersos);
			String[] terminaciones = calcularTerminaciones(versos);
			comprobarEstrofa(terminaciones);
		}
	}

	public static String[] leerVersos(int numVersos) throws IOException {
		String[] versos = new String[numVersos];
		for (int i = 0; i < numVersos; i++) {
			versos[i] = br.readLine();
		}
		return versos;
	}

	public static String[] calcularTerminaciones(String[] versos) {
		String[] terminaciones = new String[versos.length];
		for (int i = 0; i < versos.length; i++) {
			terminaciones[i] = extraerTerminacion(versos[i]);
		}
		return terminaciones;
	}

	public static String extraerTerminacion(String verso) {
		StringBuilder terminacion = new StringBuilder();
		int numVocales = 0;
		for (int j = verso.length() - 1; j >= 0; j--) {
			char letra = Character.toLowerCase(verso.charAt(j));
			if (alfabeto.indexOf(letra) >= 0) {
				terminacion.insert(0, letra);
				if (vocales.indexOf(letra) >= 0) {
					numVocales++;
				}
			}
			if (numVocales == 2) {
				break;
			}
		}
		return terminacion.toString();
	}

	public static void comprobarEstrofa(String[] terminaciones) {
		switch (terminaciones.length) {
		case 2:
			if (terminaciones[0].equals(terminaciones[1])) {
				System.out.println("PAREADO");
			} else {
				System.out.println("DESCONOCIDO");
			}
			break;
		case 3:
			if (terminaciones[0].equals(terminaciones[2]) && !terminaciones[0].equals(terminaciones[1])) {
				System.out.println("TERCETO");
			} else {
				System.out.println("DESCONOCIDO");
			}
			break;
		case 4:
			if (terminaciones[0].equals(terminaciones[1]) && terminaciones[0].equals(terminaciones[2])
					&& terminaciones[0].equals(terminaciones[3])) {
				System.out.println("CUADERNA VIA");
			} else if (terminaciones[0].equals(terminaciones[3]) && terminaciones[1].equals(terminaciones[2])
					&& !terminaciones[0].equals(terminaciones[1])) {
				System.out.println("CUARTETO");
			} else if (terminaciones[0].equals(terminaciones[2]) && terminaciones[1].equals(terminaciones[3])
					&& !terminaciones[0].equals(terminaciones[1])) {
				System.out.println("CUARTETA");
			} else if (comprobarSeguidilla(terminaciones)) {
				System.out.println("SEGUIDILLA");
			} else {
				System.out.println("DESCONOCIDO");
			}
			break;
		default:
			System.out.println("DESCONOCIDO");
			break;
		}
	}

	public static boolean comprobarSeguidilla(String[] terminaciones) {
		if (terminaciones.length != 4) {
			return false;
		}

		boolean tieneConsonante = contieneConsonante(terminaciones[1]);
		if (tieneConsonante && terminaciones[1].equals(terminaciones[3])) {
			return false;
		}

		String[] vocalesTerminaciones = extraerVocales(terminaciones);

		return vocalesTerminaciones[1].equals(vocalesTerminaciones[3])
				&& !vocalesTerminaciones[1].equals(vocalesTerminaciones[0])
				&& !vocalesTerminaciones[1].equals(vocalesTerminaciones[2])
				&& !vocalesTerminaciones[0].equals(vocalesTerminaciones[2]);
	}

	public static boolean contieneConsonante(String terminacion) {
		for (char c : terminacion.toCharArray()) {
			if (alfabeto.indexOf(c) >= 0 && !vocales.contains(String.valueOf(c))) {
				return true;
			}
		}
		return false;
	}

	public static String[] extraerVocales(String[] terminaciones) {
		String[] vocalesTerminaciones = new String[terminaciones.length];
		for (int i = 0; i < terminaciones.length; i++) {
			StringBuilder vocalesExtraidas = new StringBuilder();
			for (char c : terminaciones[i].toCharArray()) {
				if (vocales.indexOf(c) >= 0) {
					vocalesExtraidas.append(c);
				}
			}
			vocalesTerminaciones[i] = vocalesExtraidas.toString();
		}
		return vocalesTerminaciones;
	}
}