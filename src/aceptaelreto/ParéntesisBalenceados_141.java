package aceptaelreto;

import java.util.Scanner;
import java.util.Stack;

public class ParéntesisBalenceados_141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expresion;
		char caracter, caracterRecuperado;
		Stack<Character> pila = new Stack();
		boolean balanceados;

		while (sc.hasNext()) {
			expresion = sc.nextLine();
			balanceados = true;
			pila.clear();

			for (int i = 0; i < expresion.length(); i++) {
				caracter = expresion.charAt(i);

				if (caracter == '(' || caracter == '{' || caracter == '[') {
					pila.push(caracter);
				} else if (caracter == ')' || caracter == '}' || caracter == ']') {
					if (pila.isEmpty()) {
						balanceados = false;
						break;
					} else {
						caracterRecuperado = pila.pop();

					}
				}
			}
		}

	}

}
