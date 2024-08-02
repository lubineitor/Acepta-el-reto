package aceptaelreto;

import java.util.Scanner;

public class IncidenteDhahran_484 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sbEntera, sbDecimal;
        String numero;
        boolean hayPrimerDigitoSignificativo;
        int i;

        while (sc.hasNext()) {
            numero = sc.nextLine();
            //Parte entera
            i = 0; //Procesamos digitos de izquierda a derecha
            sbEntera = new StringBuilder();
            hayPrimerDigitoSignificativo = false;
            while (numero.charAt(i) != '.') {
                if (hayPrimerDigitoSignificativo) {
                    sbEntera.append(numero.charAt(i));
                } else if (numero.charAt(i) != '0') {
                    sbEntera.append(numero.charAt(i));
                    hayPrimerDigitoSignificativo = true;
                }
                i++;
            }
            if (sbEntera.length() == 0) {
                sbEntera.append('0');
            }

            //Parte decimal
            sbDecimal = new StringBuilder();
            hayPrimerDigitoSignificativo = false;
            for (int j = numero.length() - 1; j > i; j--) {
                if (hayPrimerDigitoSignificativo) {
                    sbDecimal.append(numero.charAt(j));
                } else if (numero.charAt(j) != '0') {
                    sbDecimal.append(numero.charAt(j));
                    hayPrimerDigitoSignificativo = true;
                }
            }
            if (sbDecimal.length() != 0) {
                sbEntera.append('.').append(sbDecimal.reverse());
            }
            System.out.println(sbEntera);

        }

    }

}
