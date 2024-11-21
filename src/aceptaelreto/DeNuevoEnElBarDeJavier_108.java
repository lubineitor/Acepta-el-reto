package aceptaelreto;

import java.io.*;
import java.util.*;

public class DeNuevoEnElBarDeJavier_108 {
	
	public static String cadenaCategoria(char categoria) {
		switch (categoria) {
		case 'D':
			return "DESAYUNOS";
		case 'A':
			return "COMIDAS";
		case 'M':
			return "MERIENDAS";
		case 'I':
			return "CENAS";
		case 'C':
			return "COPAS";
		default:
			return "";
		}
	}

	public static String categoriaMaximo(HashMap<Character, Double> ventas) {
		String respuesta = "EMPATE";
		double maximo = -Double.MAX_VALUE;
		boolean empate = true;

		for (Map.Entry<Character, Double> entry : ventas.entrySet()) {
			if (entry.getValue() > maximo) {
				maximo = entry.getValue();
				respuesta = cadenaCategoria(entry.getKey());
				empate = false;
			} else if (entry.getValue() == maximo) {
				empate = true;
			}
		}

		return empate ? "EMPATE" : respuesta;
	}

	public static String categoriaMinimo(HashMap<Character, Double> ventas) {
		String respuesta = "EMPATE";
		double minimo = Double.MAX_VALUE;
		boolean empate = true;

		for (Map.Entry<Character, Double> entry : ventas.entrySet()) {
			if (entry.getValue() < minimo) {
				minimo = entry.getValue();
				respuesta = cadenaCategoria(entry.getKey());
				empate = false;
			} else if (entry.getValue() == minimo) {
				empate = true;
			}
		}

		return empate ? "EMPATE" : respuesta;
	}

	public static void main(String[] args) throws Exception {
		HashMap<Character, Double> ventas = new HashMap<>();
		ventas.put('D', 0.0);
		ventas.put('A', 0.0);
		ventas.put('M', 0.0);
		ventas.put('I', 0.0);
		ventas.put('C', 0.0);

		double total = 0;
		int numVentasA = 0, numVentas = 0;
		char categoria;
		double valor;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String linea;

		while ((linea = reader.readLine()) != null) {
			categoria = linea.charAt(0);
			valor = Double.parseDouble(linea.substring(2));

			if (categoria == 'N' && valor == 0) {
				System.out.print(categoriaMaximo(ventas));
				System.out.print('#');
				System.out.print(categoriaMinimo(ventas));
				System.out.print('#');

				double mediaComidas = numVentasA > 0 ? ventas.get('A') / numVentasA : 0;
				double mediaTotal = total / numVentas;

				if (mediaComidas > mediaTotal) {
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}

				ventas.put('D', 0.0);
				ventas.put('A', 0.0);
				ventas.put('M', 0.0);
				ventas.put('I', 0.0);
				ventas.put('C', 0.0);

				total = 0;
				numVentas = 0;
				numVentasA = 0;
			} else {
				ventas.put(categoria, ventas.get(categoria) + valor);
				if (categoria == 'A') {
					numVentasA++;
				}
				total += valor;
				numVentas++;
			}
		}
	}
}