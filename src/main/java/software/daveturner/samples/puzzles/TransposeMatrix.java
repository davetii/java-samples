package software.daveturner.samples.puzzles;

import java.util.Arrays;
import java.util.List;

public class TransposeMatrix {

    public static int[][] rowsToColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] newMatrix = new int[cols][rows]; // flipped
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                newMatrix[i][j] = matrix[j][i]; // opposite
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("matrix: " + Arrays.deepToString(matrix));
        System.out.println("new matrix: " + Arrays.deepToString(rowsToColumns(matrix)));
    }




}
