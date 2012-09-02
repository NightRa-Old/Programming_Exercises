// Created by Ilan Godik

package Exercises;

import Exercises.Classes.Rectangle;
import Interfaces.IExercise;

import static Util.Util.*;

public class RectangleTest implements IExercise
{
	public void run()
	{
		p("Please enter the width: ");
		double width = in.nextDouble();
		p("Please enter the height: ");
		double height = in.nextDouble();
		Rectangle rectangle = new Rectangle(width, height);
		pl("The perimeter is: " + rectangle.getPerimeter());
		pl("The area is: " + rectangle.getArea());
	}

	public byte getChapterNumber()
	{
		return 8;
	}

	public byte getExerciseNumber()
	{
		return 1;
	}

	public String getName()
	{
		return "The Rectangle Class";
	}
}
