package aceptaelreto;

import java.util.Scanner;

public class CampoDeMinas_176 {

	private static boolean tieneMinas(char[][] campo, int fila, int col) {
		int contador = 0;
		int[] f = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] c = { -1, 0, 1, -1, 1, -1, 0, 1 };

//        if (campo[fila-1][col-1] == '*')  contador++;    
//        if (campo[fila-1][col] == '*')  contador++;    
//        if (campo[fila-1][col+1] == '*')  contador++;    
//        if (campo[fila][col-1] == '*')  contador++;    
//        if (campo[fila][col+1] == '*')  contador++;    
//        if (campo[fila+1][col-1] == '*')  contador++;    
//        if (campo[fila+1][col] == '*')  contador++;    
//        if (campo[fila+1][col+1] == '*')  contador++; 

		for (int i = 0; i < f.length; i++) {
			if (campo[fila + f[i]][col + c[i]] == '*') {
				contador++;
			}
		}
		return contador >= 6;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int filas, col;
		char[][] campo;
		String linea;
		int contadorMinas;

		while ((col = sc.nextInt()) != 0) {
			filas = sc.nextInt();
			sc.nextLine(); // Vacío el enter del buffer
			campo = new char[filas][col];
			for (int fila = 0; fila < campo.length; fila++) {
				// Con el scanner no puedo leer de carácter en carácter
				// por lo que leemos una fila completa con el método nextLine()
				linea = sc.nextLine();
				for (int columna = 0; columna < campo[0].length; columna++) {
					campo[fila][columna] = linea.charAt(columna);
				}
			}

			contadorMinas = 0;
			for (int fila = 1; fila < campo.length - 1; fila++) {
				for (int columna = 1; columna < campo[0].length - 1; columna++) {
					if (campo[fila][columna] == '-' && tieneMinas(campo, fila, col)) {
						contadorMinas++;
					}
				}
			}
			System.out.println(contadorMinas);
		}

	}

}
