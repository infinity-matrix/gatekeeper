package gatekeeper.ctci.ch01;

import java.util.Arrays;

/**
 * 1.8 Zero Matrix: 
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to O
 *
 */
public class ZeroMatrix18 {

	/**
	 * Zero out entire row and column for each occurrence of 0 in the provided matrix
	 * @param matrix Matrix to operate on
	 * @return Result Matrix
	 */
	public static int [][] zeroMatrix(int [][] matrix) {
		boolean [] rowZero = new boolean[matrix.length];
		boolean [] columnZero = new boolean[matrix[0].length];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = row; col < matrix[0].length; col++) {
				if (matrix[row][col] == 0) {
					rowZero[row] = true;
					columnZero[col] = true;
				}
			}
		}

		for (int row = 0; row < rowZero.length; row++) {
			if (rowZero[row]) {
				zeroRow(row, matrix);
			}
		}
		for (int col = 0; col < columnZero.length; col++) {
			if (columnZero[col]) {
				zeroColumn(col, matrix);
			}
		}
		return matrix;
	}

	/**
	 * Zero all columns of the provided matrix for the given row
	 * @param row Row # to zero out
	 * @param matrix Matrix to operate on
	 */
	public static void zeroRow(int row, int [][] matrix) {
		Arrays.fill(matrix[row], 0);
	}

	/**
	 * Zero all rows of the provided matrix for the given column
	 * @param col Column # to zero out
	 * @param matrix Matrix to operate on
	 */
	public static void zeroColumn(int col, int [][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			matrix[row][col] = 0;
		}
	}

	public static void main(String[] args) {
		int [][] matrix = new int [10][10];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = row + col;
			}
		}
		matrix[5][6] = 0;
		matrix[3][4] = 0;
		matrix[8][9] = 0;
		System.out.println("Input Matrix is:");
		printMatrix(matrix);
		int [][] result = zeroMatrix(matrix);
		System.out.println("\n\nResult Matrix is:");
		printMatrix(result);
	}

	/**
	 * Print the given matrix
	 * @param matrix Matrix to print out
	 */
	public static void printMatrix(int [][] matrix) {
		for (int[] ints : matrix) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(ints[col] + " \t");
			}
			System.out.println();
		}
	}
}
