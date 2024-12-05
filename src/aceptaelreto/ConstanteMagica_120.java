package aceptaelreto;

import java.io.*;

public class ConstanteMagica_120 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                String[] input = reader.readLine().split(" ");
                int dimension = Integer.parseInt(input[0]);
                int startNumber = Integer.parseInt(input[1]);

                if (dimension == 0 && startNumber == 0) {
                    break;
                }

                if (dimension == 1) {
                    System.out.println(startNumber);
                    continue;
                }

                int[][] magicSquare = generateMagicSquare(dimension, startNumber);
                int magicConstant = calculateMagicConstant(magicSquare);
                System.out.println(magicConstant);
            }
        }
    }

    private static int[][] generateMagicSquare(int dimension, int startNumber) {
        int[][] magicSquare = new int[dimension][dimension];
        boolean[][] visited = new boolean[dimension][dimension];

        int row = 0;
        int col = dimension / 2;

        while (true) {
            if (row < 0) {
                row = dimension - 1;
            }
            if (col == dimension) {
                col = 0;
            }

            if (visited[row][col]) {
                row += 2;
                col -= 1;
            }

            magicSquare[row][col] = startNumber++;
            visited[row][col] = true;

            if (row == 0 && col == dimension - 1) {
                break;
            }

            row--;
            col++;
        }

        return magicSquare;
    }

    private static int calculateMagicConstant(int[][] magicSquare) {
        int dimension = magicSquare.length;
        int magicConstant = 0;

        for (int i = 0; i < dimension; i++) {
            magicConstant += magicSquare[i][dimension - 1 - i];
        }

        return magicConstant;
    }
}