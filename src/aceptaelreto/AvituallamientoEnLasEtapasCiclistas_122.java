package aceptaelreto;

import java.util.*;

public class AvituallamientoEnLasEtapasCiclistas_122 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int inputNumber = scanner.nextInt();
			if (inputNumber == -1)
				break;

			int currentPosition = 0;
			int longestEatingStreak = 0;
			int currentEatingStreak = 0;
			int streakStartPosition = 0;
			int bestStreakStartPosition = -1;
			boolean hasEaten = false;

			while (true) {
				int nextNumber = scanner.nextInt();
				if (nextNumber == -1)
					break;

				if (inputNumber == nextNumber) {
					hasEaten = true;
					currentEatingStreak++;
					if (currentEatingStreak == 1)
						streakStartPosition = currentPosition;

					if (currentEatingStreak > longestEatingStreak) {
						longestEatingStreak = currentEatingStreak;
						bestStreakStartPosition = streakStartPosition;
					}
				} else {
					currentEatingStreak = 0;
				}

				inputNumber = nextNumber;
				currentPosition++;
			}

			if (!hasEaten) {
				System.out.println("HOY NO COMEN");
			} else {
				System.out.println(bestStreakStartPosition + " " + longestEatingStreak);
			}
		}
		scanner.close();
	}
}
