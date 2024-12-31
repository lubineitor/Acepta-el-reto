package aceptaelreto;

import java.io.*;

public class AprobarQuimica_111 {

    public static int disponibles(String nivel) {
        switch (nivel.charAt(1)) {
            case 's':
                return 2;
            case 'p':
                return 6;
            case 'd':
                return 10;
            case 'f':
                return 14;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String[] niveles = { "1s", "2s", "2p", "3s", "3p", "4s", "3d", "4p", "5s", "4d", "5p", "6s", "4f", "5d", "6p", "7s", "5f", "6d", "7p" };

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String elemento;

            while (true) {
                elemento = reader.readLine();

                if (elemento == null || elemento.equalsIgnoreCase("Exit")) {
                    break;
                }

                String electronesStr = reader.readLine();
                
                int electrones;
                try {
                    electrones = Integer.parseInt(electronesStr);
                } catch (NumberFormatException e) {
                    continue;
                }

                int i = 0;
                StringBuilder configuracion = new StringBuilder();

                while (i < niveles.length && electrones > disponibles(niveles[i])) {
                    configuracion.append(niveles[i]).append(disponibles(niveles[i])).append(" ");
                    electrones -= disponibles(niveles[i]);
                    i++;
                }

                if (i < niveles.length) {
                    configuracion.append(niveles[i]).append(electrones);
                }

                System.out.println(configuracion.toString());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}