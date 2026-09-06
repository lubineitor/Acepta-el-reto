import java.io.*;

public class EnCamposDeFutbol_403 {

    private static final BufferedInputStream IN =
            new BufferedInputStream(System.in, 4096);

    private static final BufferedOutputStream OUT =
            new BufferedOutputStream(System.out, 4096);

    private static int nextInt() throws IOException {
        int c;
        int n = 0;

        do {
            c = IN.read();
        } while (c <= ' ');

        while (c > ' ') {
            n = n * 10 + c - '0';
            c = IN.read();
        }

        return n;
    }

    public static void main(String[] args) throws IOException {

        int casos = nextInt();

        while (casos-- > 0) {
            int superficie = nextInt();
            int campos = nextInt();

            if (superficie >= campos * 4050 &&
                superficie <= campos * 10800) {

                OUT.write('S');
                OUT.write('I');
            } else {
                OUT.write('N');
                OUT.write('O');
            }

            OUT.write('\n');
        }

        OUT.flush();
    }
}