package aceptaelreto;

import java.util.Scanner;

public class PuntosDeSilla_600 {

    private static boolean menorIgualFila(int[][] matriz, int f, int dato) {
        for (int col = 0; col < matriz[0].length; col++) {
            if (dato > matriz[f][col]) {
                return false;
            }
        }
        return true;
    }

    private static boolean mayorIgualFila(int[][] matriz, int f, int dato) {
        for (int col = 0; col < matriz[0].length; col++) {
            if (dato < matriz[f][col]) {
                return false;
            }
        }
        return true;
    }

    private static boolean menorIgualColumna(int[][] matriz, int c, int dato) {
        for (int fila = 0; fila < matriz.length; fila++) {
            if (dato > matriz[fila][c]) {
                return false;
            }
        }
        return true;
    }

    private static boolean mayorIgualColumna(int[][] matriz, int c, int dato) {
        for (int fila = 0; fila < matriz.length; fila++) {
            if (dato < matriz[fila][c]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas, columnas;
        int[][] matriz;
        boolean esPuntoDeSilla;

        while ((filas = sc.nextInt()) != 0) {
            columnas = sc.nextInt();

            matriz = new int[filas][columnas];
            // Lectura de datos
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[0].length; c++) {
                    matriz[f][c] = sc.nextInt();
                }
            }

            // Procesamos los elementos
            esPuntoDeSilla = false;
            exterior:
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[0].length; c++) {
                    if ((menorIgualFila(matriz, f, matriz[f][c])
                            && mayorIgualColumna(matriz, c, matriz[f][c]))
                            || (mayorIgualFila(matriz, f, matriz[f][c])
                            && menorIgualColumna(matriz, c, matriz[f][c]))) {
                        esPuntoDeSilla = true;
                        break exterior;
                    }
                }
            }
            if (esPuntoDeSilla) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

}
