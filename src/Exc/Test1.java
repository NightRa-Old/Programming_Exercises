// Created by Ilan Godik

package Exc;

import Interfaces.IExc;
import static Main.Main.*;

public class Test1 implements IExc {
	public void run() {
		pl("Test is running!");
	}

	public byte getChapterNumber() {
		return 1;
	}

	public byte getExerciseNumber() {
		return 3;
	}

	public String getName() {
		return "Test";
	}
}
