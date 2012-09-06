// Created by Ilan Godik

package Exercises;

import Interfaces.IExercise;

import java.util.GregorianCalendar;

import static Util.Util.*;

public class GregCalendar implements IExercise {
	public void run() {
		GregorianCalendar calendar = new GregorianCalendar();
		pl("The current date is: " + getFormattedDate(calendar));
		p("Please enter a time in ms from 1970 to display:");
		calendar.setTimeInMillis(in.nextLong());
		pl("The date is: " + getFormattedDate(calendar));
	}

	public String getFormattedDate(GregorianCalendar g) {
		return g.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (g.get(GregorianCalendar.MONTH) + 1) + "/" + g.get(GregorianCalendar.YEAR);
	}

	public byte getChapterNumber() {
		return 8;
	}

	public byte getExerciseNumber() {
		return 5;
	}

	public String getName() {
		return "Gregorian calendar exercise";
	}
}
