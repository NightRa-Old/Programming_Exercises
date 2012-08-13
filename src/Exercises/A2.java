// Created by Ilan Godik

package Exercises;

import Interfaces.IExercise;

import static Main.Main.*;

public class A2 implements IExercise {
	public void run() {
		pl("Running A2");
	}

	public byte getChapterNumber() {
		return 1;
	}

	public byte getExerciseNumber() {
		return 4;
	}

	public String getName() {
		return "Test A2";
	}
}
