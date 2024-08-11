package aceptaelreto;

import java.io.IOException;

public class Ascensor2_156 {

	private static int readInt() throws IOException {
		boolean negativo = false;
		int ret = 0; // Valor que se va a devolver
		int c;
		c = System.in.read();
		if (c == 45) { // Signo -
			negativo = true;
			c = System.in.read();
		}
		while (c != 10 && c != 32) { // Mientras no se pulse Enter o espacio
			ret = ret * 10 + c - '0';

			c = System.in.read();
		}
		if (negativo) {
			return ret * -1;
		} else {
			return ret;
		}
	}

	public static void main(String[] args) throws IOException {
		int recorrido, origen, destino;

		while ((origen = readInt()) != -1) {
			// Cada iteracción representa un caso de prueba.
			recorrido = 0;
			while ((destino = readInt()) != -1) {
				recorrido += Math.abs(origen - destino);
				origen = destino;
			}
			System.out.println(recorrido);
		}
	}
}

//    private static int readNat() throws IOException {
//        int ret = 0; //Valor que se va a devolver
//        int c;
//        c = System.in.read();
//        while (c != 10 && c != 32) { //Mientras no se pulse Enter o espacio
//            ret = ret * 10 + c - '0';
//
//            c = System.in.read();
//        }
//        return ret;
//    }