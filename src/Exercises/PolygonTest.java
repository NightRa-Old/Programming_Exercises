// Created by Ilan Godik

package Exercises;

import Exercises.Classes.RegularPolygon;
import Interfaces.IExercise;

import static Util.Util.*;

public class PolygonTest implements IExercise {
	public void run() {
		RegularPolygon polygon = null;
		boolean finished = false;
		do {
			byte selection = select();
			switch (selection) {
				case 1:
					polygon = new RegularPolygon();
					finished = true;
					break;
				case 2:
					p("Please enter how much sides does the polygon has: ");
					int n = in.nextInt();
					p("Please enter the size of the side: ");
					double size = in.nextDouble();
					polygon = new RegularPolygon(n, size);
					finished = true;
					break;
				default:
					pl("Invalid selection");
			}
		} while (!finished);
		pl("The perimeter is:" + polygon.getPerimeter());
		pl("The area is: " + polygon.getArea());
	}

	private byte select() {
		pl("There are 2 options: ");
		pl("1. Default polygon (3 sides, length of 1)");
		pl("2. Choose the sides and length");
		return in.nextByte();
	}

	public byte getChapterNumber() {
		return 8;
	}

	public byte getExerciseNumber() {
		return 9;
	}

	public String getName() {
		return "Regular polygons";
	}
}
