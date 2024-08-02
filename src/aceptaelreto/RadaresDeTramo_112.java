package aceptaelreto;

import java.util.Scanner;

public class RadaresDeTramo_112 {

    public static void main(String[] args) {
        /*
            El usuario indica la velocidad en Km/h. Por lo tanto, los
            metros y segundos se deben convertir a km y horas respectivamente.
         */

        Scanner sc = new Scanner(System.in);
        final int KILOMETRO = 1000;
        final int HORA = 3600;

        //La distancai en metros, el limite en Km/h y el tiempo en segundos
        double distancia, limite, tiempo;
        double velocidad; //Velocidad expresada en Km

        while (true) {
            distancia = sc.nextInt();
            limite = sc.nextInt();
            tiempo = sc.nextInt();

            if (distancia == 0 && limite == 0 && tiempo == 0) {
                break;
            }
            if (distancia <= 0 || limite <= 0 || tiempo <= 0) {
                System.out.println("ERROR");
            } else {
                //Calculo la velocidad en Km/h
                distancia /= KILOMETRO;
                tiempo /= HORA;
                velocidad = distancia / tiempo;
                if (velocidad <= limite) {
                    System.out.println("OK");
                } else if (velocidad < limite * 1.2) {
                    System.out.println("MULTA");
                } else {
                    System.out.println("PUNTOS");
                }

            }
        }

    }

}
