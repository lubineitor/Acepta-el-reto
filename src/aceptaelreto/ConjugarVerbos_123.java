package aceptaelreto;

import java.io.*;

public class ConjugarVerbos_123 {

	private static final String[] PERSONAS = { "yo ", "tu ", "el ", "nosotros ", "vosotros ", "ellos " };
	private static final String[] CONJUNCIONES_FUTURO = { "e", "as", "a", "emos", "eis", "an" };

	public static void imprimirPresente(String verbo, PrintWriter out) {
		if (verbo.length() < 2)
			return;

		String terminacion = verbo.substring(verbo.length() - 2);
		String raiz = verbo.substring(0, verbo.length() - 2);
		String raizNosVos = verbo.substring(0, verbo.length() - 1);

		for (int i = 0; i < 6; i++) {
			StringBuilder conjugacion = new StringBuilder(PERSONAS[i]);
			switch (i) {
			case 0:
				conjugacion.append(raiz).append("o");
				break;
			case 1:
				conjugacion.append(raiz).append(terminacion.equals("ar") ? "as" : "es");
				break;
			case 2:
				conjugacion.append(raiz).append(terminacion.equals("ar") ? "a" : "e");
				break;
			case 3:
				conjugacion.append(raizNosVos).append("mos");
				break;
			case 4:
				conjugacion.append(raizNosVos).append(terminacion.equals("ir") ? "s" : "is");
				break;
			case 5:
				conjugacion.append(terminacion.equals("ir") ? raiz + "en" : raizNosVos + "n");
				break;
			}
			out.println(conjugacion);
		}
	}

	public static void imprimirPreterito(String verbo, PrintWriter out) {
		if (verbo.length() < 2)
			return;

		String terminacion = verbo.substring(verbo.length() - 2);
		String raiz = verbo.substring(0, verbo.length() - 2);
		String raizNosVos = verbo.substring(0, verbo.length() - 1);

		for (int i = 0; i < 6; i++) {
			StringBuilder conjugacion = new StringBuilder(PERSONAS[i]);
			switch (i) {
			case 0:
				conjugacion.append(terminacion.equals("ar") ? raiz + "e" : raiz + "i");
				break;
			case 1:
				conjugacion.append(terminacion.equals("ar") ? raizNosVos + "ste" : raiz + "iste");
				break;
			case 2:
				conjugacion.append(
						terminacion.equals("ar") ? raiz + "o" : raiz + (terminacion.equals("er") ? "io" : "io"));
				break;
			case 3:
				conjugacion.append(terminacion.equals("ar") ? raizNosVos + "mos" : raiz + "imos");
				break;
			case 4:
				conjugacion.append(terminacion.equals("ar") ? raizNosVos + "steis" : raiz + "isteis");
				break;
			case 5:
				conjugacion.append(terminacion.equals("ar") ? raiz + "aron" : raiz + "ieron");
				break;
			}
			out.println(conjugacion);
		}
	}

	public static void imprimirFuturo(String verbo, PrintWriter out) {
		for (int i = 0; i < 6; i++) {
			out.println(PERSONAS[i] + verbo + CONJUNCIONES_FUTURO[i]);
		}
	}

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(System.out, true)) {

			String line;
			while ((line = reader.readLine()) != null && !line.isEmpty()) {
				String[] entrada = line.split(" ");

				if (entrada.length != 2)
					continue;

				String verbo = entrada[0];
				if (verbo.length() < 2)
					continue;

				char conjugacion = entrada[1].charAt(0);

				switch (conjugacion) {
				case 'A':
					imprimirPresente(verbo, out);
					break;
				case 'P':
					imprimirPreterito(verbo, out);
					break;
				case 'F':
					imprimirFuturo(verbo, out);
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
