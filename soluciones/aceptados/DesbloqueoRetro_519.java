package aceptaelreto;

import java.io.*;

public class DesbloqueoRetro_519 {

	public static void ini(String[][] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++)
				arr[i][j] = "";
	}

	public static boolean contieneVertical(String[][] arr, int f) {
		for (int c = 0; c < arr[0].length; c++) {
			if (arr[f][c].contains("1") || arr[f][c].contains("3") || arr[f][c].contains("2"))
				return true;
			if (arr[f + 1][c].contains("8") || arr[f + 1][c].contains("7") || arr[f + 1][c].contains("9"))
				return true;
		}

		return false;
	}

	public static boolean contieneDiagonalArriba(String[][] arr, int f, int c) {
		return (c < arr[0].length - 1 && (arr[f + 1][c].contains("7") || arr[f][c + 1].contains("3")));
	}

	public static boolean contieneDiagonalAbajo(String[][] arr, int f, int c) {
		return (c < arr[0].length - 1 && (arr[f][c].contains("1") || arr[f + 1][c + 1].contains("9")));
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int f, c, posF, posC, num, pos;
		String[][] arr;
		String numeros;

		while (true) {

			String[] dimensions = br.readLine().split(" ");
			f = Integer.parseInt(dimensions[0]);
			c = Integer.parseInt(dimensions[1]);
			if (f == 0 && c == 0)
				break;

			String[] position = br.readLine().split(" ");
			posF = Integer.parseInt(position[0]) - 1;
			posC = Integer.parseInt(position[1]) - 1;
			arr = new String[f][c];
			ini(arr);
			arr[posF][posC] = "O";

			numeros = br.readLine();
			pos = 0;
			num = Integer.parseInt("" + numeros.charAt(pos++));
			while (num != 5) {

				switch (num) {
				case 1:
					arr[--posF][--posC] += "1 ";
					break;
				case 2:
					arr[--posF][posC] += "2 ";
					break;
				case 3:
					arr[--posF][++posC] += "3 ";
					break;
				case 4:
					arr[posF][--posC] += "4 ";
					break;
				case 6:
					arr[posF][++posC] += "6 ";
					break;
				case 7:
					arr[++posF][--posC] += "7 ";
					break;
				case 8:
					arr[++posF][posC] += "8 ";
					break;
				case 9:
					arr[++posF][++posC] += "9 ";
				}

				num = Integer.parseInt("" + numeros.charAt(pos++));
			}

			for (int i = 0; i < f; i++) {

				if (i == 0) {
					for (int j = 0; j < c * 2 + 1; j++) {
						if (j == 0 || j == c * 2)
							pw.print("+");
						else
							pw.print("-");
					}
					pw.println();
				}

				for (int j = 0; j < c; j++) {
					if (j == 0)
						pw.print("|");
					pw.print((arr[i][j].isEmpty()) ? "." : "O");
					if (arr[i][j].contains("4") || (j + 1 < c && arr[i][j + 1].contains("6")))
						pw.print("-");
					else if (j < c - 1)
						pw.print(" ");
					if (j == c - 1)
						pw.print("|");
				}

				if (i < f - 1 && contieneVertical(arr, i)) {
					pw.println();
					for (int j = 0; j < c; j++) {
						if (j == 0)
							pw.print("|");
						if (arr[i + 1][j].contains("8") || arr[i][j].contains("2"))
							pw.print("|");
						else
							pw.print(" ");
						if (j < c - 1) {
							if (contieneDiagonalArriba(arr, i, j) && contieneDiagonalAbajo(arr, i, j))
								pw.print("X");
							else if (contieneDiagonalAbajo(arr, i, j))
								pw.print("\\");
							else if (contieneDiagonalArriba(arr, i, j))
								pw.print("/");
							else
								pw.print(" ");
						}
						if (j == c - 1)
							pw.print("|");
					}
				} else if (i < f - 1) {
					for (int j = 0; j < c + (c - 1); j++) {
						if (j == 0)
							pw.print("\n|");
						pw.print(" ");
						if (j == (c + c - 2))
							pw.print("|");
					}
				}

				if (i == f - 1) {
					pw.println();
					for (int j = 0; j < c * 2 + 1; j++) {
						if (j == 0 || j == c * 2)
							pw.print("+");
						else
							pw.print("-");
					}
					pw.println();
				} else
					pw.println();
			}

		}

		pw.flush();
	}
}