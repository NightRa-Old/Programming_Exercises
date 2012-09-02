// Created by Ilan Godik

package Util;

import Interfaces.IExercise;

import java.util.Comparator;

public class ExerciseComparator implements Comparator<IExercise>
{

	public int compare(IExercise o1, IExercise o2)
	{
		if (o1.getChapterNumber() > o2.getChapterNumber())
		{
			return 1;
		} else if (o1.getChapterNumber() < o2.getChapterNumber())
		{
			return -1;
		} else
		{
			if (o1.getExerciseNumber() > o2.getExerciseNumber())
			{
				return 1;
			} else if (o1.getExerciseNumber() < o2.getExerciseNumber())
			{
				return -1;
			} else
			{
				return 0;
			}
		}
	}
}
