// Created by Ilan Godik

package Exercises;

import Interfaces.IExercise;

import static Main.Main.*;

public class Test1 implements IExercise {
	public void run() {
		pl("Running Test1");
	}

	public byte getChapterNumber() {
		return 2;
	}

	public byte getExerciseNumber() {
		return 3;
	}

	public String getName() {
		return "Test Test1";
	}
}
