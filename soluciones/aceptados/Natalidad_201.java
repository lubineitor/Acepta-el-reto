import java.io.*;

public class Natalidad_201 {

    private static final byte[] stack = new byte[50_000];

    public static void main(String[] args) throws Exception {

        BufferedInputStream in = new BufferedInputStream(System.in);
        BufferedWriter out =
                new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            int raiz = siguienteCaracter(in);

            if (raiz == -1 || raiz == '.') {
                break;
            }

            boolean cumpleNorma1 = true;
            boolean cumpleNorma2 = true;

            int top = 0;

            stack[0] = 0;

            while (top >= 0) {

                int caracter = siguienteCaracter(in);
                byte estado = stack[top];

                if (caracter == '.') {

                    if (estado == 0) {
                        stack[top] = 1;
                    } else {

                        if (estado == 2) {
                            cumpleNorma2 = false;
                        }
                        top--;

                        while (top >= 0 && stack[top] == 3) {
                            top--;
                        }
                    }

                } else {

                    if (estado == 0) {
                        stack[top] = 2;

                    } else if (estado == 1) {
                        cumpleNorma2 = false;
                        stack[top] = 3;

                    } else {
                        cumpleNorma1 = false;
                        stack[top] = 3;
                    }
                    stack[++top] = 0;
                }
            }

            if (cumpleNorma1 && cumpleNorma2) {
                out.write("12\n");
            } else if (cumpleNorma1) {
                out.write("1\n");
            } else if (cumpleNorma2) {
                out.write("2\n");
            } else {
                out.write("N\n");
            }
        }

        out.flush();
    }

    private static int siguienteCaracter(BufferedInputStream in)
            throws IOException {

        int c;

        do {
            c = in.read();
        } while (
                c == '\n' ||
                c == '\r' ||
                c == ' ' ||
                c == '\t'
        );

        return c;
    }
}