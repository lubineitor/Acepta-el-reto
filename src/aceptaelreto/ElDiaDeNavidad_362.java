package aceptaelreto;

import java.io.*;

public class ElDiaDeNavidad_362 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
        StringBuilder output = new StringBuilder();


		int N = Integer.parseInt(reader.readLine());

		for (int i = 0; i < N; i++) {
			String[] fecha = reader.readLine().split(" ");
			int dia = Integer.parseInt(fecha[0]);
			int mes = Integer.parseInt(fecha[1]);

			if (dia == 25 && mes == 12) {
                output.append("SI\n");
            } else {
                output.append("NO\n");
            }
		}

		writer.print(output);
		writer.flush();
		writer.close();
		reader.close();
	}
}