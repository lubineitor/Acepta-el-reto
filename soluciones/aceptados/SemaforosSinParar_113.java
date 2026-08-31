package aceptaelreto;

import java.util.*;

class TrafficLight {
	
	int redCycleDuration;
	int greenCycleDuration;
	int totalCycleDuration;
	int position;

	TrafficLight(int redDuration, int greenDuration, int position) {
		this.redCycleDuration = redDuration;
		this.greenCycleDuration = greenDuration;
		this.totalCycleDuration = redDuration + greenDuration;
		this.position = position;
	}
}

public class SemaforosSinParar_113 {

	private static boolean canPassAllLights(ArrayList<TrafficLight> trafficLights, int numberOfLights,
			double totalDistance, int totalTime) {
		double timeAtLight;
		int cyclePosition;
		for (int i = 0; i < numberOfLights - 1; ++i) {
			timeAtLight = totalTime * (trafficLights.get(i).position / totalDistance);
			cyclePosition = (int) timeAtLight / trafficLights.get(i).totalCycleDuration;
			timeAtLight -= cyclePosition * trafficLights.get(i).totalCycleDuration;
			if (timeAtLight < (trafficLights.get(i).redCycleDuration - 0.01) && timeAtLight > 0.01) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int numberOfLights = sc.nextInt();
			int maxSpeed = sc.nextInt();
			if (numberOfLights == 0)
				break;

			ArrayList<TrafficLight> trafficLights = new ArrayList<>();
			double totalDistance = 0;
			boolean hasRedOnlyLight = false;

			for (int i = 0; i < numberOfLights - 1; ++i) {
				int gap = sc.nextInt();
				int redDuration = sc.nextInt();
				int greenDuration = sc.nextInt();
				if (greenDuration == 0)
					hasRedOnlyLight = true;
				totalDistance += gap;
				trafficLights.add(new TrafficLight(redDuration, greenDuration, (int) totalDistance));
			}

			int finalGap = sc.nextInt();
			int finalRedDuration = sc.nextInt();
			int finalGreenDuration = sc.nextInt();
			if (finalGreenDuration == 0)
				hasRedOnlyLight = true;
			totalDistance += finalGap;
			TrafficLight finalTrafficLight = new TrafficLight(finalRedDuration, finalGreenDuration,
					(int) totalDistance);

			if (hasRedOnlyLight) {
				System.out.println("IMPOSIBLE");
				continue;
			}

			int minCycles = (int) (totalDistance / maxSpeed) / finalTrafficLight.totalCycleDuration;
			if ((totalDistance / maxSpeed) % finalTrafficLight.totalCycleDuration != 0) {
				if ((int) (totalDistance / maxSpeed) < finalTrafficLight.redCycleDuration) {
					double requiredSpeed = totalDistance
							/ (finalTrafficLight.totalCycleDuration * minCycles + finalTrafficLight.redCycleDuration);
					if (requiredSpeed < 0.1) {
						System.out.println("IMPOSIBLE");
						continue;
					}
					boolean canPass = canPassAllLights(trafficLights, numberOfLights, totalDistance,
							finalTrafficLight.redCycleDuration);
					if (canPass) {
						System.out.println(finalTrafficLight.redCycleDuration);
						continue;
					}
				}
				minCycles++;
			}

			boolean solutionFound = false;
			for (int i = minCycles;; ++i) {
				double speedWithFullCycle = totalDistance / (finalTrafficLight.totalCycleDuration * i);
				if (speedWithFullCycle < 0.1)
					break;
				solutionFound = canPassAllLights(trafficLights, numberOfLights, totalDistance,
						finalTrafficLight.totalCycleDuration * i);
				if (solutionFound) {
					System.out.println(finalTrafficLight.totalCycleDuration * i);
					break;
				}
				double speedWithAdditionalRed = totalDistance
						/ (finalTrafficLight.totalCycleDuration * i + finalTrafficLight.redCycleDuration);
				if (speedWithAdditionalRed < 0.1)
					break;
				solutionFound = canPassAllLights(trafficLights, numberOfLights, totalDistance,
						finalTrafficLight.totalCycleDuration * i + finalTrafficLight.redCycleDuration);
				if (solutionFound) {
					System.out.println(finalTrafficLight.totalCycleDuration * i + finalTrafficLight.redCycleDuration);
					break;
				}
			}

			if (!solutionFound) {
				System.out.println("IMPOSIBLE");
			}
		}

		sc.close();
	}
}
