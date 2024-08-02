package aceptaelreto;

import java.util.Scanner;

public class OrganizandoHangares_429 {

    private static int hangarConMasEspacio(int[] hangares) {
        int pos = 0;
        int max = hangares[0];
        for (int i = 1; i < hangares.length; i++) {
            if (hangares[i] > max) {
                max = hangares[i];
                pos = i;
            }
        }
        return pos;
    }

    public static boolean hayEspacio(int[] hangares, int[] naves) {
        int posicion;
        for (int i = 0; i < naves.length; i++) {
            posicion = hangarConMasEspacio(hangares);
            if (naves[i] <= hangares[posicion]) {
                hangares[posicion] -= naves[i];
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] hangares, naves;
        int numHangares, numNaves;

        while ((numHangares = in.nextInt()) != 0) {
            hangares = new int[numHangares];
            for (int i = 0; i < numHangares; i++) {
                hangares[i] = in.nextInt();
            }
            numNaves = in.nextInt();
            naves = new int[numNaves];
            for (int i = 0; i < numNaves; i++) {
                naves[i] = in.nextInt();
            }

            if (hayEspacio(hangares, naves)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}
