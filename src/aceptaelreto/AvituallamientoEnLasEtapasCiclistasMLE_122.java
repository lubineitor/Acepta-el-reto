package aceptaelreto;

import java.io.*;

public class AvituallamientoEnLasEtapasCiclistasMLE_122 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out, true);
        StringBuilder outputBuilder = new StringBuilder();
        String inputLine;

        try {
            while ((inputLine = reader.readLine()) != null) {
                String[] inputNumbers = inputLine.trim().split(" ");
                int initialNumber = Integer.parseInt(inputNumbers[0]);

                if (initialNumber == -1) {
                    break;
                }

                int position = 0;
                int maxPosition = -1;
                int currentLength = 0;
                int maxLength = 0;
                boolean hasEaten = false;

                for (int i = 1; i < inputNumbers.length; i++) {
                    int currentNumber = Integer.parseInt(inputNumbers[i]);

                    if (currentNumber == -1) {
                        break;
                    }

                    if (currentNumber == initialNumber) {
                        hasEaten = true;
                        currentLength++;
                        
                        if (currentLength > maxLength) {
                            maxLength = currentLength;
                            maxPosition = position - currentLength + 1;
                        }
                    } else {
                        currentLength = 1;
                        initialNumber = currentNumber;
                    }

                    position++;
                }

                if (!hasEaten) {
                    outputBuilder.append("HOY NO COMEN\n");
                } else {
                    outputBuilder.append(maxPosition).append(" ").append(maxLength).append("\n");
                }
            }
        } catch (IOException e) {
            outputBuilder.append(e.getMessage()).append("\n");
        } catch (NumberFormatException e) {
            outputBuilder.append(e.getMessage()).append("\n");
        } finally {
            writer.print(outputBuilder.toString());
            writer.close();
        }
    }
}
