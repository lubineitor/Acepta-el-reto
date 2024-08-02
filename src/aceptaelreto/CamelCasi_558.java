package aceptaelreto;

import java.util.HashMap;
import java.util.Scanner;

public class CamelCasi_558 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] claves;
        int numVariables;
        HashMap<String, StringBuilder> map = new HashMap();
        String variable, clave;
        StringBuilder sb;

        while (sc.hasNext()) {
            map.clear();
            numVariables = sc.nextInt();
            claves = new String[numVariables];
            sc.nextLine(); //Limpiar el Enter
            for (int i = 0; i < numVariables; i++) {
                variable = sc.nextLine();
                clave = variable.toUpperCase();
                claves[i] = clave;
                sb = map.get(clave);
                if (sb == null) {
                    map.put(clave, new StringBuilder(variable));
                } else {
                    for (int j = 0; j < sb.length(); j++) {
                        if (variable.charAt(j) <= 90) { // 90 código ASCII de 'z'
                            sb.setCharAt(j, variable.charAt(j));
                        }
                        map.put(clave, sb);
                    }
                }
            }
            for (int i = 0; i < claves.length; i++) {
                System.out.println(map.get(claves[i]));
            }
            System.out.println("---");
        }
    }

}
