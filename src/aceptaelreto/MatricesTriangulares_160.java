package aceptaelreto;

import java.util.Scanner;

public class MatricesTriangulares_160 {

    private static boolean esTriangularSuperior(int[][] matriz) {
        for (int fila = 0; fila < matriz.length - 1; fila++) {
            for (int col = fila + 1; col < matriz[0].length; col++) {
                if (matriz[fila][col] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean esTriangularInferior(int[][] matriz) {
        for (int fila = 1; fila < matriz.length; fila++) {
            for (int col = 0; col < fila; col++) {
                if (matriz[fila][col] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        int[][] matriz;

        while ((filas = sc.nextInt()) != 0) {
            matriz = new int[filas][filas]; //Matriz cuadrada
            for (int fila = 0; fila < filas; fila++) {
                for (int col = 0; col < filas; col++) {
                    matriz[fila][col] = sc.nextInt();

                }
            }
            if (esTriangularSuperior(matriz) || esTriangularInferior(matriz)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}
