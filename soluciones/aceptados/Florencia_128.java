import java.io.*;

public class Florencia_128 {

    public static void main(String[] args) throws Exception {
        FastScanner in = new FastScanner();

        while (true) {
            long longitudVarilla = in.nextLong();

            if (longitudVarilla == -1) {
                break;
            }

            long varillasCompradas = 0;
            long retales = 0;
            long restante = 0;

            boolean imposible = false;

            while (true) {
                long nervios = in.nextLong();

                if (nervios == -1) {
                    break;
                }

                long segmentosPorNervio = in.nextLong();
                long longitudSegmento = in.nextLong();

                if (imposible) {
                    continue;
                }

                if (longitudSegmento > longitudVarilla) {
                    imposible = true;
                    continue;
                }

                long segmentosNecesarios = nervios * segmentosPorNervio;

                if (restante > 0) {

                    long caben = restante / longitudSegmento;
                    long usados = Math.min(segmentosNecesarios, caben);

                    restante -= usados * longitudSegmento;
                    segmentosNecesarios -= usados;

                    if (segmentosNecesarios > 0) {
                        retales += restante;
                        restante = 0;
                    }
                }

                if (segmentosNecesarios == 0) {
                    continue;
                }

                long segmentosPorVarilla = longitudVarilla / longitudSegmento;
                long restoPorVarilla = longitudVarilla % longitudSegmento;

                long varillasCompletas = segmentosNecesarios / segmentosPorVarilla;
                long segmentosUltima = segmentosNecesarios % segmentosPorVarilla;

                if (segmentosUltima == 0) {

                    varillasCompradas += varillasCompletas;

                    if (varillasCompletas > 1) {
                        retales += (varillasCompletas - 1) * restoPorVarilla;
                    }

                    restante = restoPorVarilla;

                } else {

                    varillasCompradas += varillasCompletas + 1;

                    retales += varillasCompletas * restoPorVarilla;

                    restante =
                            longitudVarilla
                            - segmentosUltima * longitudSegmento;
                }
            }

            if (imposible) {
                System.out.println("IMPOSIBLE");
            } else {
                retales += restante;

                System.out.println(
                        varillasCompradas + " " + retales
                );
            }
        }
    }

    private static class FastScanner {

        private final BufferedInputStream in =
                new BufferedInputStream(System.in);

        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ' && c != -1);

            boolean negative = false;

            if (c == '-') {
                negative = true;
                c = read();
            }

            long result = 0;

            while (c > ' ') {
                result = result * 10 + (c - '0');
                c = read();
            }

            return negative ? -result : result;
        }
    }
}