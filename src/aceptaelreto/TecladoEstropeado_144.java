package aceptaelreto;

import java.util.ArrayList;
import java.util.Scanner;

public class TecladoEstropeado_144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> letras;
        String presionados;
        int pos;

        while (sc.hasNext()) {
            presionados = sc.nextLine();

            pos = 0;
            letras = new ArrayList();
            for (int i = 0; i < presionados.length(); i++) {
                switch (presionados.charAt(i)) {
                    case '-':
                        pos = 0;
                        break;
                    case '*':
                        pos++;
                        break;
                    case '3':
                        if (!letras.isEmpty() && pos <= letras.size() - 1) {
                            letras.remove(pos);
                            break;
                        }
                    case '+':
                        if (letras.isEmpty()) {
                            pos = 0;
                        } else {
                            pos = letras.size();
                        }
                        break;
                    default:
                        if (pos > letras.size()) {
                            if (!letras.isEmpty()) {
                                pos = letras.size();
                            } else {
                                pos = 0;
                            }
                        }
                        letras.add(pos++, presionados.charAt(i));
                }
            }
            for (Character c: letras) {
                System.out.print(c + "");
            }
            System.out.println();
           
        }
    }

}
