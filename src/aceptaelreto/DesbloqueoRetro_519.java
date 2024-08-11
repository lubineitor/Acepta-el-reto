package aceptaelreto;

import java.util.Scanner;

public class DesbloqueoRetro_519 {

	private static void inicializarPantalla(char[][] pantalla) {
		// Esquinas
		pantalla[0][0] = '+';
		pantalla[0][pantalla[0].length - 1] = '+';
		pantalla[pantalla.length - 1][0] = '+';
		pantalla[pantalla.length - 1][pantalla[0].length - 1] = '+';

		// Lineas horizontales arriba y abajo
		for (int col = 1; col < pantalla[0].length - 1; col++) {
			pantalla[0][col] = '-';
			pantalla[pantalla.length - 1][col] = '-';
		}

		// Lineas verticales izquierda y derecha
		for (int fil = 1; fil < pantalla.length - 1; fil++) {
			pantalla[fil][0] = '|';
			pantalla[fil][pantalla[0].length - 1] = '|';
		}

		for (int f = 1; f < pantalla.length - 1; f++) {
			for (int c = 1; c < pantalla[0].length - 1; c++) {
				pantalla[f][c] = ' ';
			}
		}

		for (int f = 1; f < pantalla.length - 1; f += 2) {
			for (int c = 1; c < pantalla[0].length - 1; c += 2) {
				pantalla[f][c] = '.';
			}
		}
	}

	private static void verPantalla(char[][] pantalla) {
		for (int f = 0; f < pantalla.length; f++) {
			for (int c = 0; c < pantalla[0].length; c++) {
				System.out.print(pantalla[f][c]);
			}
			System.out.println("");
		}
	}

	private static void procesarMovimientos(char[][] pantalla, String movimientos, int fila, int col) {
		// Se resta 1 a la longitud de los movimientos porque
		// el último carácter es un 5 y no hay que procesarlo
		for (int i = 0; i < movimientos.length() - 1; i++) {
			switch (movimientos.charAt(i)) {
			case '1':
				fila--;
				col--;
				if (pantalla[fila][col] != ' ') {
					pantalla[fila][col] = 'X';
				} else {
					pantalla[fila][col] = '\\';
				}
				fila--;
				col--;
				pantalla[fila][col] = 'O';
				break;
			case '2':
				fila--;
				pantalla[fila][col] = '|';
				fila--;
				pantalla[fila][col] = 'O';
				break;
			case '3':
				fila--;
				col++;
				if (pantalla[fila][col] != ' ') {
					pantalla[fila][col] = 'X';
				} else {
					pantalla[fila][col] = '/';
				}
				fila--;
				col++;
				pantalla[fila][col] = 'O';
				break;
			case '4':
				col--;
				pantalla[fila][col] = '-';
				col--;
				pantalla[fila][col] = 'O';
				break;
			case '6':
				col++;
				pantalla[fila][col] = '-';
				col++;
				pantalla[fila][col] = 'O';
				break;
			case '7':
				fila++;
				col--;
				if (pantalla[fila][col] != ' ') {
					pantalla[fila][col] = 'X';
				} else {
					pantalla[fila][col] = '/';
				}
				fila++;
				col--;
				pantalla[fila][col] = 'O';
				break;
			case '8':
				fila++;
				pantalla[fila][col] = '|';
				fila++;
				pantalla[fila][col] = 'O';
				break;
			case '9':
				fila++;
				col++;
				if (pantalla[fila][col] != ' ') {
					pantalla[fila][col] = 'X';
				} else {
					pantalla[fila][col] = '\\';
				}
				fila++;
				col++;
				pantalla[fila][col] = 'O';
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas, columnas;
		int filaOrigen, colOrigen;
		char[][] pantalla;
		String movimientos;

		while ((filas = sc.nextInt()) != 0) {
			columnas = sc.nextInt();
			pantalla = new char[filas + 2 + (filas - 1)][columnas + 2 + (columnas - 1)];

			inicializarPantalla(pantalla);

			filaOrigen = sc.nextInt();
			colOrigen = sc.nextInt();
			sc.nextLine(); // Vaciar enter
			pantalla[filaOrigen][colOrigen] = 'O';

			movimientos = sc.nextLine();
			procesarMovimientos(pantalla, movimientos, filaOrigen, colOrigen);

			verPantalla(pantalla);
		}
	}
}
