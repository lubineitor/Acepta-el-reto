package aceptaelreto;

import java.util.Scanner;

public class LaAbuelaMaria_337 {

    public static void main(String[] args) {
        final int DIENTES = 6;
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int[] arriba = new int[DIENTES];
        int[] abajo = new int[DIENTES];
        int suma;
        boolean hueco;

        for (; casos-- > 0;) {
            for (int i = 0; i < DIENTES; i++) {
                arriba[i] = sc.nextInt();
            }
            for (int i = 0; i < DIENTES; i++) {
                abajo[i] = sc.nextInt();
            }
            suma = arriba[0] + abajo[0];
            hueco = false;
            for (int i = 1; i < DIENTES; i++) {
                hueco = suma != arriba[i] + abajo[i];
                if (hueco) {
                    break;
                }
            }
            if (hueco) {
                System.out.println("NO");
            }else{
                System.out.println("SI");
            }
        }

    }

}
