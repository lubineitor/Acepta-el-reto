package aceptaelreto;

import java.io.*;

public class ElHombreSinMiedoYSinRadar_479 {

    private static String distancia(char[][] matriz, int f, int c, String direccion) {
        int contador = 0;
        int df = 0, dc = 0;

        switch (direccion.trim()) {
            case "ARRIBA":
                df = -1;
                break;
            case "ABAJO":
                df = 1;
                break;
            case "DERECHA":
                dc = 1;
                break;
            case "IZQUIERDA":
                dc = -1;
                break;
            default:
                return "NINGUNO";
        }

        int nuevaF = f + df;
        int nuevaC = c + dc;

        while (nuevaF >= 0 && nuevaF < matriz.length && nuevaC >= 0 && nuevaC < matriz[0].length) {
            contador++;
            if (matriz[nuevaF][nuevaC] == 'X') {
                return String.valueOf(contador);
            }
            nuevaF += df;
            nuevaC += dc;
        }

        return "NINGUNO";
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] dimensiones = linea.trim().split("\\s+");
                int filas = Integer.parseInt(dimensiones[0]);
                if (filas == 0) break;
                
                int col = Integer.parseInt(dimensiones[1]);
                char[][] matriz = new char[filas][col];

                for (int f = 0; f < filas; f++) {
                    matriz[f] = br.readLine().toCharArray();
                }

                int casos = Integer.parseInt(br.readLine().trim());
                for (int i = 0; i < casos; i++) {
                    linea = br.readLine().trim();
                    String[] datos = linea.split("\\s+");
                    int fOrigen = Integer.parseInt(datos[0]) - 1;
                    int cOrigen = Integer.parseInt(datos[1]) - 1;

                    if (fOrigen == -1 && cOrigen == -1) {
                        return;
                    }

                    String direccion = datos[2];
                    System.out.println(distancia(matriz, fOrigen, cOrigen, direccion));
                }
                
                System.out.println("---");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}
