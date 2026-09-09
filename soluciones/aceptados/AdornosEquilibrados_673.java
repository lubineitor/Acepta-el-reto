import java.io.*;

public class AdornosEquilibrados_673 {

    private static class FastScanner {
        private final InputStream input = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int pointer = 0;
        private int length = 0;

        private int read() throws IOException {
            if (pointer >= length) {
                length = input.read(buffer);
                pointer = 0;

                if (length == -1) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        int nextInt() throws IOException {
            int character;

            do {
                character = read();

                if (character == -1) {
                    return Integer.MIN_VALUE;
                }
            } while (character <= ' ');

            int sign = 1;

            if (character == '-') {
                sign = -1;
                character = read();
            }

            int number = 0;

            while (character > ' ') {
                number = number * 10 + character - '0';
                character = read();
            }

            return number * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out)
        );

        while (true) {
            int n = scanner.nextInt();

            if (n == Integer.MIN_VALUE) {
                break;
            }

            int c = scanner.nextInt();

            if (n == 0) {
                break;
            }

            int[] accumulated = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                accumulated[i] =
                        accumulated[i - 1] + scanner.nextInt();
            }

            int split = 1;
            int bestStart = -1;
            int bestWeight = Integer.MIN_VALUE;

            for (int left = 0; left + c <= n; left++) {
                int right = left + c;

                if (split < left + 1) {
                    split = left + 1;
                }

                long target =
                        (long) accumulated[left] + accumulated[right];

                while (split < right
                        && 2L * accumulated[split] < target) {
                    split++;
                }

                if (split < right
                        && 2L * accumulated[split] == target) {

                    int weight =
                            accumulated[right] - accumulated[left];

                    if (weight > bestWeight) {
                        bestWeight = weight;
                        bestStart = left + 1;
                    }
                }
            }

            if (bestStart == -1) {
                output.write("SIN ADORNOS");
            } else {
                output.write(Integer.toString(bestStart));
            }

            output.newLine();
        }

        output.flush();
    }
}