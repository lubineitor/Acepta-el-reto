package aceptaelreto;

import java.util.*;

public class CodigosDeBarras_106 {
	private static final Map<String, String> PAISES_MAP;
	static {
		PAISES_MAP = new HashMap<>();
		PAISES_MAP.put("380", "Bulgaria");
		PAISES_MAP.put("539", "Irlanda");
		PAISES_MAP.put("560", "Portugal");
		PAISES_MAP.put("759", "Venezuela");
		PAISES_MAP.put("850", "Cuba");
		PAISES_MAP.put("890", "India");
	}

	private static final Map<String, String> CODIGOS_ADICIONALES;
	static {
		CODIGOS_ADICIONALES = new HashMap<>();
		CODIGOS_ADICIONALES.put("70", "Noruega");
		CODIGOS_ADICIONALES.put("50", "Inglaterra");
		CODIGOS_ADICIONALES.put("00", "EEUU");
	}

	public static String identificarPais(String codigo) {
		String pais = PAISES_MAP.get(codigo.substring(0, 3));
		if (pais != null) {
			return pais;
		}

		String prefix = codigo.substring(0, 2);
		return CODIGOS_ADICIONALES.getOrDefault(prefix, "Desconocido");
	}

	private static boolean esCodigoValido(String codigo) {
		int len = codigo.length();
		if (len < 8 || len > 13) {
			return false;
		}

		int suma = 0;
		boolean esDoble = false;

		for (int i = len - 2; i >= 0; i--) {
			int digito = Character.getNumericValue(codigo.charAt(i));
			suma += esDoble ? digito : digito * 3;
			esDoble = !esDoble;
		}

		int digitoControl = Character.getNumericValue(codigo.charAt(len - 1));
		return (suma + digitoControl) % 10 == 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String codigo = sc.nextLine();
			if (codigo.equals("0")) {
				break;
			}

			if (esCodigoValido(codigo)) {
				if (codigo.length() >= 13) {
					String pais = identificarPais(codigo);
					System.out.println("SI " + pais);
				} else {
					System.out.println("SI");
				}
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}