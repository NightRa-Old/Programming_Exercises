// Created by Ilan Godik

package Exercises;

import Interfaces.IExercise;

import static Util.Util.*;

public class SumMatrix implements IExercise {
	public void run() {
		p("Please enter the size of the matrix. \n The template is: a*b\n");
		String matrixSize = in.next();
		int rows;
		int columns;
		try {
			rows = Integer.parseInt(matrixSize.substring(0, matrixSize.indexOf('*')));
			columns = Integer.parseInt(matrixSize.substring(matrixSize.indexOf('*') + 1, matrixSize.length()));
			pl("Please enter the " + (rows * columns) + " elements:");
			int[][] matrix = new int[rows][columns];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix[i][j] = in.nextInt();
				}
			}
			pl("The sum of the matrix is: " + sumMatrix(matrix));
		} catch (Exception e) {
			pl("Invalid template!\n");
			if (debugMode) e.printStackTrace();
			run();
		}
	}

	public static int sumMatrix(int[][] m) {
		if (m.length < 1 || m[1].length < 1) {
			p("Please pass a two dimensional array with a length of at least 1");
			if (debugMode) p("; <= XD");
			pl("");
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sum += m[i][j];
			}
		}
		return sum;
	}

	public byte getChapterNumber() {
		return 7;
	}

	public byte getExerciseNumber() {
		return 1;
	}

	public String getName() {
		return "Summing all the numbers in a matrix";
	}
}
