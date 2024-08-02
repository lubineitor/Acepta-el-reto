package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

class Ciclista implements Comparable<Ciclista> {

    public int posicion;
    public int tiempo; // Tiempo medido en segundos

    public Ciclista(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int compareTo(Ciclista c) {
        // Devuelve:
        // valor negativo: si este objeto es menor
        // cero: si son iguales
        // valor positivo: si este objeto es mayor
        return this.tiempo - c.tiempo;
    }

}

public class EntrandoEnPeloton_464 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ciclista[] ciclistas, entradas;
        int numeroCiclistas;

        while (sc.hasNext()) {
            sc.nextLine();
            numeroCiclistas = sc.nextInt();
            ciclistas = new Ciclista[numeroCiclistas];
            entradas = new Ciclista[numeroCiclistas];
            int horas, minutos, segundos;
            String tiempo;
            int posicion;

            for (int i = 0; i < numeroCiclistas; i++) {
                tiempo = sc.nextLine();
//                String[] tiempos = tiempo.split(":");

                horas = Integer.parseInt(tiempo.substring(0, 2));
                minutos = Integer.parseInt(tiempo.substring(3, 5));
                segundos = Integer.parseInt(tiempo.substring(6, 8));

                ciclistas[i] = new Ciclista(horas * 3600 + minutos * 60 + segundos);
                entradas[i] = ciclistas[i];
            }
            Arrays.sort(ciclistas);

            posicion = 1;
            ciclistas[0].posicion = posicion;
            for (int i = 1; i < ciclistas.length; i++) {
                if (ciclistas[i].tiempo > ciclistas[i - 1].tiempo + 1) {
                    posicion = i + 1;
                }
                ciclistas[i].posicion = posicion;
            }
            for (Ciclista entrada : entradas) {
                System.out.println(entrada.posicion);
            }
            System.out.println("---");
        }

    }

}
