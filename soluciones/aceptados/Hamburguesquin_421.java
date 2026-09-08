import java.io.*;
import java.util.Arrays;

public class Hamburguesquin_421 {

    private static final int FIN_DE_ENTRADA = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        FastScanner entrada = new FastScanner();
        BufferedWriter salida = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int longitud = entrada.leerEntero();
            if (longitud == FIN_DE_ENTRADA) {
                break;
            }

            int restaurantes = entrada.leerEntero();
            if (restaurantes == FIN_DE_ENTRADA) {
                break;
            }

            if (longitud == 0 && restaurantes == 0) {
                break;
            }

            long[] intervalos = new long[restaurantes];

            for (int i = 0; i < restaurantes; i++) {
                int posicion = entrada.leerEntero();
                int radio = entrada.leerEntero();

                int inicio = posicion - radio;
                int fin = posicion + radio;

                intervalos[i] = ((long) inicio << 32) | (fin & 0xffffffffL);
            }

            Arrays.sort(intervalos);

            int necesarios = calcularMinimo(intervalos, longitud);
            int respuesta = necesarios == -1 ? -1 : restaurantes - necesarios;

            salida.write(Integer.toString(respuesta));
            salida.write('\n');
            salida.flush();
        }

        salida.flush();
    }

    private static int calcularMinimo(long[] intervalos, int longitud) {
        int indice = 0;
        int cubiertoHasta = 0;
        int utilizados = 0;

        while (cubiertoHasta < longitud) {
            int mayorFin = cubiertoHasta;

            while (indice < intervalos.length
                    && obtenerInicio(intervalos[indice]) <= cubiertoHasta) {
                mayorFin = Math.max(mayorFin, obtenerFin(intervalos[indice]));
                indice++;
            }

            if (mayorFin == cubiertoHasta) {
                return -1;
            }

            cubiertoHasta = mayorFin;
            utilizados++;
        }

        return utilizados;
    }

    private static int obtenerInicio(long intervalo) {
        return (int) (intervalo >> 32);
    }

    private static int obtenerFin(long intervalo) {
        return (int) intervalo;
    }

    private static class FastScanner {
        private final BufferedInputStream entrada = new BufferedInputStream(System.in);

        int leerEntero() throws IOException {
            int caracter;

            do {
                caracter = entrada.read();
                if (caracter == -1) {
                    return FIN_DE_ENTRADA;
                }
            } while (caracter <= ' ');

            int signo = 1;
            if (caracter == '-') {
                signo = -1;
                caracter = entrada.read();
            }

            int numero = 0;
            while (caracter > ' ') {
                numero = numero * 10 + caracter - '0';
                caracter = entrada.read();
            }

            return numero * signo;
        }
    }
}
