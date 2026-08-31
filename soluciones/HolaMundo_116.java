package aceptaelreto;

import java.io.*;

public class HolaMundo_116 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        int n = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < n; i++) {
            writer.println("Hola mundo.");
        }
        writer.flush();
    }
}