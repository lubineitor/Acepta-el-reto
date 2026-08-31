package aceptaelreto;

import java.io.*;
import java.util.*;

public class LigaDePadel_109 {

    public static boolean resuelveCaso(BufferedReader reader) throws IOException {
        String categoriaName = reader.readLine().trim();

        if (categoriaName.equals("FIN")) {
            return false;
        }

        Map<String, int[]> equipos = new HashMap<>();
        String linea;

        while ((linea = reader.readLine()) != null && !linea.trim().equals("FIN")) {
            String[] partes = linea.trim().split("\\s+");
            if (partes.length != 4) {
                continue;
            }

            String equipoLocal = partes[0];
            int setsLocal = Integer.parseInt(partes[1]);
            String equipoVisitante = partes[2];
            int setsVisitante = Integer.parseInt(partes[3]);

            actualizaPuntos(equipos, equipoLocal, setsLocal > setsVisitante);
            actualizaPuntos(equipos, equipoVisitante, setsLocal <= setsVisitante);
        }

        String mejorEquipo = "";
        int puntosMaximos = -1;
        int partidosTotalesPosibles = (equipos.size() - 1) * 2;
        int partidosSinJugar = 0;

        for (Map.Entry<String, int[]> entry : equipos.entrySet()) {
            String equipo = entry.getKey();
            int[] info = entry.getValue();
            int puntos = info[0];

            if (puntos > puntosMaximos) {
                mejorEquipo = equipo;
                puntosMaximos = puntos;
            } else if (puntos == puntosMaximos) {
                mejorEquipo = "EMPATE";
            }

            partidosSinJugar += partidosTotalesPosibles - info[1];
        }

        System.out.println(mejorEquipo + " " + partidosSinJugar / 2);
        return true;
    }

    private static void actualizaPuntos(Map<String, int[]> equipos, String equipo, boolean gano) {
        int[] info = equipos.get(equipo);
        if (info == null) {
            info = new int[]{0, 0};
            equipos.put(equipo, info);
        }
        info[0] += (gano) ? 2 : 1;
        info[1]++;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (resuelveCaso(reader)) {

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}