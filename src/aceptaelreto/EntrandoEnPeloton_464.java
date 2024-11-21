package aceptaelreto;

import java.io.*;
import java.util.*;

class Ciclista implements Comparable<Ciclista> {
	
	public int posicion;
	public int tiempo;

	public Ciclista(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public int compareTo(Ciclista c) {
		return Integer.compare(this.tiempo, c.tiempo);
	}
}

public class EntrandoEnPeloton_464 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String input;

		while ((input = br.readLine()) != null && !input.isEmpty()) {
			int numeroCiclistas = Integer.parseInt(input.trim());
			Ciclista[] ciclistas = new Ciclista[numeroCiclistas];
			Ciclista[] entradas = new Ciclista[numeroCiclistas];

			for (int i = 0; i < numeroCiclistas; i++) {
				String[] tiempoParts = br.readLine().trim().split(":");
				int horas = Integer.parseInt(tiempoParts[0]);
				int minutos = Integer.parseInt(tiempoParts[1]);
				int segundos = Integer.parseInt(tiempoParts[2]);

				int tiempoTotal = horas * 3600 + minutos * 60 + segundos;
				Ciclista ciclista = new Ciclista(tiempoTotal);
				ciclistas[i] = ciclista;
				entradas[i] = ciclista;
			}

			Arrays.sort(ciclistas);

			int posicion = 1;
			ciclistas[0].posicion = posicion;

			for (int i = 1; i < numeroCiclistas; i++) {
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
	}
}