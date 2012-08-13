// Created by Ilan Godik

package Main;

import Interfaces.IExercise;

import java.io.File;
import java.net.URL;
import java.util.*;

public class Main {
	public static Scanner in = new Scanner(System.in);
	public static Main instance;
	private ArrayList<IExercise> exercises = new ArrayList<IExercise>();

	public static void main(String[] args) {
		instance = new Main();
	}

	public Main() {
		load();
		sort();
		menu();
	}

	private void menu() {
		pl("These are my exercises:");
		IExercise currentExercise;
		for (int i = 0; i < exercises.size(); i++) {
			currentExercise = exercises.get(i);
			pl((i + 1) + ":   " + currentExercise.getChapterNumber() + "." + currentExercise.getExerciseNumber() + ":  " + currentExercise.getName());
		}
		boolean validSelection = false;
		p("Please enter your selection: ");
		while (!validSelection) {
			int selection = in.nextInt();
			if (selection < exercises.size() && selection > 0) {
				exercises.get(selection - 1).run();
				validSelection = true;
			} else {
				p("Please enter a valid selection: ");
			}
		}
	}

	private void load() {
		String packageName = "Exercises";
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		ArrayList<String> names = new ArrayList<String>();
		URL packageURL = classLoader.getResource(packageName);
		if (packageURL != null) {
			File folder = new File(packageURL.getFile());
			File[] files = folder.listFiles();
			String entryName;

			if (files != null) {
				for (File actual : files) {
					entryName = actual.getName();
					entryName = entryName.substring(0, entryName.lastIndexOf('.'));
					names.add(entryName);
				}

				for (String s : names) {
					try {
						add((IExercise) Class.forName("Exercises." + s).newInstance());
					} catch (ClassNotFoundException e) {
						pl("Class not found.");
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			} else {
				pl("\"files\" is null! Please add some class files for the launcher to work.");
				System.exit(0);
			}
		} else {
			pl("packageURL is null! Aborting!");
			System.exit(1);
		}
	}

	private void add(IExercise exercise) {
		exercises.add(exercise);
	}

	public void sort() {
		TreeSet<IExercise> sortedExercises = new TreeSet<IExercise>(new ExerciseComparator());
		sortedExercises.addAll(exercises);
		exercises.clear();
		exercises.addAll(sortedExercises);
	}

	public static Main getInstance() {
		return instance;
	}

	public static void pl(String s) {
		System.out.println(s);
	}

	public static void p(String s) {
		System.out.print(s);
	}
}
