import java.io.*;

public class Natalidad_201 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder salida = new StringBuilder();

        String arbol;

        while ((arbol = br.readLine()) != null) {

            if (arbol.equals(".")) {
                break;
            }

            boolean cumpleNorma1 = true;
            boolean cumpleNorma2 = true;

            byte[] pila = new byte[(arbol.length() + 1) / 2 + 1];

            int cima = 0;

            for (int i = 1; i < arbol.length(); i++) {

                boolean hayHijo = arbol.charAt(i) != '.';

                byte estado = pila[cima];

                if (estado == 0) {

                    pila[cima] = (byte) (hayHijo ? 2 : 1);

                    if (hayHijo) {
                        cima++;
                        pila[cima] = 0;
                    }

                } else {

                    boolean hayPrimerHijo = estado == 2;

                    int numeroHijos =
                            (hayPrimerHijo ? 1 : 0)
                            + (hayHijo ? 1 : 0);

                    if (numeroHijos == 2) {
                        cumpleNorma1 = false;
                    }

                    if (numeroHijos == 1) {
                        cumpleNorma2 = false;
                    }

                    cima--;
                    
                    if (hayHijo) {
                        cima++;
                        pila[cima] = 0;
                    }
                }
            }

            if (cumpleNorma1 && cumpleNorma2) {
                salida.append("12");
            } else if (cumpleNorma1) {
                salida.append('1');
            } else if (cumpleNorma2) {
                salida.append('2');
            } else {
                salida.append('N');
            }

            salida.append('\n');
        }

        System.out.print(salida);
    }
}