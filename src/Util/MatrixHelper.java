// Created by Ilan Godik

package Util;

import static Util.Util.*;

public class MatrixHelper {
	public static int[][] getCustomMatrixFromUser(String prompt) {
		p("Please enter the size of the matrix. \n The template is: rows*columns\n");
		String matrixSize = in.next();
		int rows;
		int columns;
		try {
			rows = Integer.parseInt(matrixSize.substring(0, matrixSize.indexOf('*')));
			columns = Integer.parseInt(matrixSize.substring(matrixSize.indexOf('*') + 1, matrixSize.length()));
			pl(prompt);
			return getDefinedMatrixFromUser(rows, columns);
		} catch (Exception e) {
			pl("Invalid template!\n");
			if (debugMode) e.printStackTrace();
			return getCustomMatrixFromUser(prompt);
		}
	}

	public static int[][] getCustomMatrixFromUser() {
		return getCustomMatrixFromUser("Please enter the elements row by row:");
	}

	public static int[][] getDefinedMatrixFromUser(int rows, int columns) {
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		return matrix;
	}
}
