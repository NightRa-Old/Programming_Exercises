// Created by Ilan Godik

package Exercises;

import Interfaces.IExercise;
import Util.MatrixHelper;

import static Util.Util.*;

public class SumMatrix implements IExercise {
	public void run() {
		int[][] matrix = MatrixHelper.getCustomMatrixFromUser();
		pl("The sum of the matrix is: " + sumMatrix(matrix));
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
