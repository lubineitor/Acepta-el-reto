package aceptaelreto;

import java.util.*;

public class LlenandoPiscinas2_131 {

	    private static int getViajes(int piscina, int barreno, int pierde) {
	        if (pierde >= barreno && barreno < piscina) return Integer.MAX_VALUE;
	        else if (barreno >= piscina) return 1;
	        int viajes = 0, aux, rest;
	        while (piscina > 1) {
	            aux = piscina / barreno;
	            rest = aux * pierde;
	            piscina = (piscina - (aux * barreno)) + rest;
	            viajes += aux;
	            if (piscina != 0 && piscina <= barreno) {
	                viajes++; break;
	            }
	        }
	        return viajes;
	    }

	    public static void main(String[] args) {

	        final Scanner sc = new Scanner(System.in);

	        int pisA, barrA, piA, pisB, barrB, piB;
	        int yo, vecino;

	        while (true) {

	            pisA  = sc.nextInt();
	            barrA = sc.nextInt();
	            piA   = sc.nextInt();
	            pisB  = sc.nextInt();
	            barrB = sc.nextInt();
	            piB   = sc.nextInt();

	            if (pisA == 0 || pisB == 0) break;

	            yo     = getViajes(pisA, barrA, piA);
	            vecino = getViajes(pisB, barrB, piB);


	            if (yo == vecino) System.out.println("EMPATE " + yo);
	            else if (yo < vecino) System.out.println("YO " + yo);
	            else System.out.println("VECINO " + vecino);
	        }

	    }

	}