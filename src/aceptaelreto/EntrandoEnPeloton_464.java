package aceptaelreto;

import java.io.*;
import java.util.*;

class Ciclista implements Comparable<Ciclista> {
	public int posicion;
	public int tiempo; // Tiempo medido en segundos

	public Ciclista(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public int compareTo(Ciclista c) {
		// Devuelve:
		// valor negativo: si este objeto es menor
		// cero: si son iguales
		// valor positivo: si este objeto es mayor
		return this.tiempo - c.tiempo;
	}
}

public class EntrandoEnPeloton_464 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		Ciclista[] ciclistas, entradas;
		int numeroCiclistas;

		String input;
		while ((input = br.readLine()) != null && !input.isEmpty()) {
			numeroCiclistas = Integer.parseInt(input.trim());
			ciclistas = new Ciclista[numeroCiclistas];
			entradas = new Ciclista[numeroCiclistas];
			int horas, minutos, segundos;
			String tiempo;
			int posicion;

			for (int i = 0; i < numeroCiclistas; i++) {
				tiempo = br.readLine().trim();

				horas = Integer.parseInt(tiempo.substring(0, 2));
				minutos = Integer.parseInt(tiempo.substring(3, 5));
				segundos = Integer.parseInt(tiempo.substring(6, 8));

				ciclistas[i] = new Ciclista(horas * 3600 + minutos * 60 + segundos);
				entradas[i] = ciclistas[i];
			}

			Arrays.sort(ciclistas);

			posicion = 1;
			ciclistas[0].posicion = posicion;

			for (int i = 1; i < ciclistas.length; i++) {
				if (ciclistas[i].tiempo > ciclistas[i - 1].tiempo + 1) {
					posicion = i + 1;
				}
				ciclistas[i].posicion = posicion;
			}

			for (Ciclista entrada : entradas) {
				pw.println(entrada.posicion);
			}

			pw.println("---");
		}

		pw.flush();
		pw.close();
	}
}
