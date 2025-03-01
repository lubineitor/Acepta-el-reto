package aceptaelreto;

import java.io.*;

public class LosProblemasDeSerRico_191 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int casos = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < casos; i++) {
				String[] tokens = br.readLine().split("\\s+");
				int compartimentos = Integer.parseInt(tokens[0]);
				int capacidadMayor = Integer.parseInt(tokens[1]);
				int diferencia = Integer.parseInt(tokens[2]);

				long sumaTotal = (long) compartimentos * capacidadMayor
						- (long) diferencia * compartimentos * (compartimentos - 1) / 2;
				System.out.println(sumaTotal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
