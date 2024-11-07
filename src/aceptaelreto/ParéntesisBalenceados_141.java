package aceptaelreto;

import java.io.*;
import java.util.*;

public class ParentesisBalanceados_141 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String expresion;
        Stack<Character> pila = new Stack<>();

        while ((expresion = br.readLine()) != null) {
            boolean balanceados = true;
            pila.clear();

            for (int i = 0; i < expresion.length(); i++) {
                char caracter = expresion.charAt(i);

                if (caracter == '(' || caracter == '{' || caracter == '[') {
                    pila.push(caracter);
                } else if (caracter == ')' || caracter == '}' || caracter == ']') {
                    if (pila.isEmpty()) {
                        balanceados = false;
                        break;
                    } else {
                        char caracterRecuperado = pila.pop();
                        if (!esParBalanceado(caracterRecuperado, caracter)) {
                            balanceados = false;
                            break;
                        }
                    }
                }
            }
            
            if (balanceados && pila.isEmpty()) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }
        
        pw.flush();
    }

    private static boolean esParBalanceado(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
}