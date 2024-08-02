package aceptaelreto;

import java.util.Scanner;

public class NumeroHyperpar_165 {

    private static boolean esHyperpar(int n) {
        while (n > 0) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while ((n = sc.nextInt()) > -1) {
            if (esHyperpar(n)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }

    }

}
