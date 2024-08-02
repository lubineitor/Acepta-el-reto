package aceptaelreto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Potitos_185 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        ArrayList<String> gustan = new ArrayList();
        ArrayList<String> noGustan = new ArrayList();
        String ingrediente;

        while ((casos = sc.nextInt()) != 0) {
            gustan.clear();
            noGustan.clear();

            for (; casos-- > 0;) {
                if (sc.next().equals("SI:")) {
                    while (!(ingrediente = sc.next()).equals("FIN")) {
                        gustan.add(ingrediente);
                    }
                } else {
                    while (!(ingrediente = sc.next()).equals("FIN")) {
                        noGustan.add(ingrediente);
                    }
                }
            }
//            for (int i = 0; i < gustan.size(); i++) {
//                noGustan.remove(gustan.get(i));
//            }
//            for (String i : gustan) {
//                noGustan.remove(i);
//            }
            noGustan.removeAll(gustan);

            if (!noGustan.isEmpty()) {
                Collections.sort(noGustan);
                System.out.print(noGustan.get(0));
                for (int i = 1; i < noGustan.size(); i++) {
                    System.out.print(" " + noGustan.get(i));
                }
                System.out.println("");
            }
        }
    }
}
