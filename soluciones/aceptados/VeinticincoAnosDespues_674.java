import java.io.BufferedInputStream;
import java.io.IOException;

public class VeinticincoAnosDespues_674 {

    private static long cerosFactorial(long numero) {
        long ceros = 0;

        while (numero > 0) {
            numero /= 5;
            ceros += numero;
        }

        return ceros;
    }

    private static long primerNumeroConAlMenos(long objetivo, long limite) {
        long izquierda = 1;
        long derecha = limite;

        while (izquierda < derecha) {
            long medio = izquierda + (derecha - izquierda) / 2;

            if (cerosFactorial(medio) >= objetivo) {
                derecha = medio;
            } else {
                izquierda = medio + 1;
            }
        }

        return izquierda;
    }

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner();
        StringBuilder salida = new StringBuilder();

        while (true) {
            long d = scanner.nextLong();
            long n = scanner.nextLong();

            if (d == 0 && n == 0) {
                break;
            }

            long limite = 5L * (n + 1);

            long primero = primerNumeroConAlMenos(n, limite);
            long siguiente = primerNumeroConAlMenos(n + 1, limite);
            long ultimo = siguiente - 1;

            if (cerosFactorial(primero) != n) {
                salida.append("NINGUNO\n");
                continue;
            }

            long respuesta = ((primero + d - 1) / d) * d;

            if (respuesta <= ultimo) {
                salida.append(respuesta).append('\n');
            } else {
                salida.append("NINGUNO\n");
            }
        }

        System.out.print(salida);
    }

    private static class FastScanner {

        private final BufferedInputStream entrada =
                new BufferedInputStream(System.in);

        private int leer() throws IOException {
            return entrada.read();
        }

        long nextLong() throws IOException {
            int caracter;

            do {
                caracter = leer();
            } while (caracter <= ' ');

            long numero = 0;

            while (caracter > ' ') {
                numero = numero * 10 + caracter - '0';
                caracter = leer();
            }

            return numero;
        }
    }
}