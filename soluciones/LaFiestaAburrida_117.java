package aceptaelreto;

import java.io.*;

public class LaFiestaAburrida_117 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int numeroPersonas = Integer.parseInt(reader.readLine().trim());
            StringBuilder salida = new StringBuilder();

            for (int i = 0; i < numeroPersonas; i++) {
                String linea = reader.readLine().trim();
                String nombre = linea.split(" ")[1];
                salida.append("Hola, ").append(nombre).append(".\n");
            }

            System.out.print(salida);

        } catch (NumberFormatException e) {
            System.err.println("Error: La entrada debe ser un número válido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: El formato de la línea no es válido.");
        } catch (IOException e) {
            System.err.println("Error al leer los datos de entrada.");
        }
    }
}