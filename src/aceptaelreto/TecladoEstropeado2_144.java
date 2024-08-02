package aceptaelreto;

import java.util.ArrayList;
import java.util.Scanner;

public class TecladoEstropeado2_144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> salida = new ArrayList();
        String entrada;
        int pos;
        // - : Inicio
        // + : Fin
        // * : flecha derecha
        // 3 : Supr (borra a la derecha del cursos)

        while (sc.hasNext()) {
            salida.clear();
            entrada = sc.nextLine();
            pos = 0;
            for (int i = 0; i < entrada.length(); i++) {
                switch (entrada.charAt(i)) {
                    case '-': // Inicio
                        pos = 0;
                        break;
                    case '+': // Fin
                        pos = salida.size();
                        break;
                    case '*': // Flecha derecha
                        pos++;
                        break;
                    case '3': // Supr (borra a la derecha del cursor)
                        if (!salida.isEmpty() && pos <= salida.size() - 1) {
                            salida.remove(pos);
                        }
                        break;
                    default:
                        salida.add(pos++, entrada.charAt(i));
                        break;
                }

            }
            for (Character c : salida) {
                System.out.print(c);
            }
            System.out.println("");

        }
    }

}
