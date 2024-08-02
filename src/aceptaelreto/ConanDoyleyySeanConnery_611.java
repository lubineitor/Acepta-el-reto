package aceptaelreto;

import java.util.Scanner;

public class ConanDoyleyySeanConnery_611 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoSir;
        int numObras;
        int menor,contador,posicion = 0;
        int ano;
        String obra, obraSeleccionada = "";

        while (sc.hasNext()) {
            anoSir = sc.nextInt();
            sc.nextLine();//Ignoro mombre autor porque no se utiliza
            numObras = sc.nextInt();

            menor = Integer.MAX_VALUE;
            contador = 0;

            for (int i = 0; i < numObras; i++) {
                ano = sc.nextInt();
                if (ano >= anoSir) {
                    contador++;
                    if (ano < menor) {
                        obra = sc.nextLine();//Cuidado! NextLine() también lee el 
                        // espacio en blanco que hay entre los años y el nombre de las
                        // obras, hay que eliminarlo
                        obra = obra.substring(1, obra.length());
                        menor = ano;
                        obraSeleccionada = obra;
                    }
                } else {
                    sc.nextLine();
                }
            }
            if (contador == 0) {
                System.out.println("NINGUNA");
            } else if (contador == numObras) {
                System.out.println("TODAS");
            } else {
                System.out.println(obraSeleccionada);
            }
        }

    }

}
