import java.io.*;

public class Por3OMas5_192 {

    private static final int MAX = 20_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        boolean[] alcanzable = calcularAlcanzables();

        String linea;

        while ((linea = br.readLine()) != null) {
            int numero = Integer.parseInt(linea.trim());

            if (numero == 0) {
                break;
            }

            output.append(alcanzable[numero] ? "SI\n" : "NO\n");
        }

        System.out.print(output);
    }

    private static boolean[] calcularAlcanzables() {
        boolean[] alcanzable = new boolean[MAX + 1];

        alcanzable[1] = true;

        for (int numero = 1; numero <= MAX; numero++) {
            if (!alcanzable[numero]) {
                continue;
            }

            int suma = numero + 5;

            if (suma <= MAX) {
                alcanzable[suma] = true;
            }

            int multiplicacion = numero * 3;

            if (multiplicacion <= MAX) {
                alcanzable[multiplicacion] = true;
            }
        }

        return alcanzable;
    }
}