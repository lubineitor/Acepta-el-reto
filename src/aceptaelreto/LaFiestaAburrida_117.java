package aceptaelreto;

import java.io.*;

public class LaFiestaAburrida_117 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numeroPersonas = Integer.parseInt(reader.readLine());
		StringBuilder salida = new StringBuilder();

		for (int i = 0; i < numeroPersonas; i++) {
			String linea = reader.readLine();
			String nombre = linea.split(" ")[1];
			salida.append("Hola, ").append(nombre).append(".\n");
		}
		System.out.print(salida.toString());
	}
}
