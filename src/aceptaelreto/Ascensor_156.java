package aceptaelreto;

import java.io.*;

public class Ascensor_156 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split(" ");

            int anterior = Integer.parseInt(numbers[0]);
            if (anterior < 0) {
                break;
            }

            int suma = 0;

            for (int i = 1; i < numbers.length; i++) {
                int siguiente = Integer.parseInt(numbers[i]);
                if (siguiente == -1) {
                    break;
                }

                suma += Math.abs(anterior - siguiente);
                anterior = siguiente;
            }

            writer.println(suma);
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
