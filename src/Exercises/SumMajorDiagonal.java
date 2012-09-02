// Created by Ilan Godik

package Exercises;

import Interfaces.IExercise;
import Util.MatrixHelper;

import static Util.Util.pl;

public class SumMajorDiagonal implements IExercise
{

	public void run()
	{
		int[][] matrix = MatrixHelper.getCustomMatrixFromUser();
		pl("The sum of the major diagonal is:" + sumMainDiagonal(matrix));
	}

	private int sumMainDiagonal(int[][] matrix)
	{
		int sum = 0;
		for (int i = 0; i < matrix.length && i < matrix[0].length; i++)
		{
			sum += matrix[i][i];
		}
		return sum;
	}

	public byte getChapterNumber()
	{
		return 7;
	}

	public byte getExerciseNumber()
	{
		return 2;
	}

	public String getName()
	{
		return "Summing the major diagonal in a matrix";
	}
}
