package aceptaelreto;

import java.util.Scanner;

public class AbuelasFalsas_446 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int numNietos;
        String nieto, ultimoNieto, nietoActual;
        boolean abuelaFalsa;

        for (; casos-- > 0;) {
            nieto = sc.next();
            numNietos = sc.nextInt();
            abuelaFalsa = false;
            if (numNietos == 1) {
                System.out.println("FALSA");
                sc.nextLine();
            } else {
                for (int i = 0; i < numNietos - 1; i++) {
                    nietoActual = sc.next();
                    if (nietoActual.equals(nieto)) {
                        System.out.println("FALSA");
                        sc.nextLine();
                        abuelaFalsa = true;
                        break;
                    }
                }
                if (!abuelaFalsa) {
                    ultimoNieto = sc.nextLine();
                    ultimoNieto = ultimoNieto.trim();
                    if (ultimoNieto.equals(nieto)) {
                        System.out.println("VERDADERA");
                    } else {
                        System.out.println("FALSA");
                    }
                }
            }
        }

    }

}
