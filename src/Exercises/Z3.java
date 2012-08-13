// Created by Ilan Godik

package Exercises;

import Interfaces.IExercise;

import static Main.Main.*;

public class Z3 implements IExercise {
	public void run() {
		pl("Running Z3");
	}

	public byte getChapterNumber() {
		return 1;
	}

	public byte getExerciseNumber() {
		return 2;
	}

	public String getName() {
		return "Test Z3";
	}
}
