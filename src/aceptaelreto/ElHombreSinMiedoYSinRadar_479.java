package aceptaelreto;

import java.util.Scanner;

public class ElHombreSinMiedoYSinRadar_479 {

    private static String distancia(char[][] matriz, int f, int c, String direccion) {
        int contador = 1;
        boolean villano = false;
        switch (direccion) {
            case "ARRIBA":
                for (int i = f - 1; i >= 0; i--) {
                    if (matriz[i][c] == 'X') {
                        villano = true;
                        break;
                    } else {
                        contador++;
                    }
                }
                break;
            case "ABAJO":
                for (int i = f + 1; i < matriz.length; i++) {
                    if (matriz[i][c] == 'X') {
                        villano = true;
                        break;
                    } else {
                        contador++;
                    }
                }
                break;
            case "DERECHA":
                for (int i = c + 1; i < matriz[f].length; i++) {
                    if (matriz[i][c] == 'X') {
                        villano = true;
                        break;
                    } else {
                        contador++;
                    }
                }
                break;
            default:
                for (int i = c - 1; i >= 0; i--) {
                    if (matriz[i][c] == 'X') {
                        villano = true;
                        break;
                    } else {
                        contador++;
                    }
                }

        }
        if (villano) {
            return String.valueOf(contador);
        } else {
            return "NINGUNO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas, col, fOrigen, cOrigen;
        char[][] matriz = null;
        String linea;
        int casos;
        String direccion;

        while ((filas = sc.nextInt()) != 0) {
            col = sc.nextInt();
            sc.nextLine(); //Vacío el buffer (queda un enter pendiente de procesar)
            matriz = new char[filas][col];
            for (int f = 0; f < matriz.length; f++) {
                linea = sc.nextLine();
                for (int c = 0; c < matriz[f].length; c++) {
                    matriz[f][c] = linea.charAt(c);
                }
            }
            casos = sc.nextInt();
            for (; casos-- > 0;) {
                fOrigen = sc.nextInt() - 1;
                cOrigen = sc.nextInt() - 1;
                direccion = sc.nextLine();

                System.out.println(distancia(matriz, fOrigen, cOrigen, 
                        direccion.substring(1, direccion.length())));
            }
        }

    }

}
