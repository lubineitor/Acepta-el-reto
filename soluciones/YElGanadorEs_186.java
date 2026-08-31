package aceptaelreto;

import java.io.*;

public class YElGanadorEs_186 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);

		int players, games, mostVotedPlayer, maxVotes;
		boolean isTie;

		while (true) {
			String[] input = reader.readLine().split(" ");
			players = Integer.parseInt(input[0]);
			games = Integer.parseInt(input[1]);

			if (players == 0 && games == 0)
				break;

			int[] votes = new int[players + 1];

			for (int i = 0; i < games; i++) {
				String[] gameData = reader.readLine().split(" ");
				int player = Integer.parseInt(gameData[0]);
				votes[player]++;
			}

			mostVotedPlayer = 0;
			maxVotes = -1;
			isTie = false;

			for (int i = 1; i <= players; i++) {
				if (votes[i] > maxVotes) {
					maxVotes = votes[i];
					mostVotedPlayer = i;
					isTie = false;
				} else if (votes[i] == maxVotes) {
					isTie = true;
				}
			}

			writer.println(isTie ? "EMPATE" : mostVotedPlayer);
		}

		writer.flush();
		writer.close();
	}
}