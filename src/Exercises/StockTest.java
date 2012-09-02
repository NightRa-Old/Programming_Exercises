// Created by Ilan Godik

package Exercises;

import Exercises.Classes.Stock;
import Interfaces.IExercise;

import static Util.Util.*;

public class StockTest implements IExercise {
	public void run() {
		Stock sun = new Stock("JAVA", "Sun Micro systems Inc");
		sun.setCurrentPrice(4.35);
		sun.setPreviousClosingPrice(4.5);
		pl("The price percentage change of " + sun.getName() + " is: " + shortenDouble(sun.getChangePercent(), 3) + ".");
	}

	public byte getChapterNumber() {
		return 8;
	}

	public byte getExerciseNumber() {
		return 2;
	}

	public String getName() {
		return "Stock class test";
	}
}
