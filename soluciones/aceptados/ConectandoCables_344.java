package aceptaelreto;

import java.io.*;

public class ConectandoCables_344 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(System.out)) {

            int casosPrueba = Integer.parseInt(reader.readLine().trim());

            for (int i = 0; i < casosPrueba; i++) {
                reader.readLine();
                String cables = reader.readLine().trim();

                int macho = 0;
                int hembra = 0;

                for (int j = 0; j < cables.length(); j++) {
                    char conector = cables.charAt(j);
                    if (conector == 'M') {
                        macho++;
                    } else if (conector == 'H') {
                        hembra++;
                    }
                }

                if (macho == hembra) {
                    writer.println("POSIBLE");
                } else {
                    writer.println("IMPOSIBLE");
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}