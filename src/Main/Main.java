// Created by Ilan Godik

package Main;

import Interfaces.IExc;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

public class Main {
	public static Main instance;
	private ArrayList<IExc> Exercises = new ArrayList<IExc>();

	public static void main(String[] args) {
		instance = new Main();
	}

	public Main() {
		load();
		sort(Exercises);
		printMenu();
	}

	private void printMenu() {
		for (IExc ex : Exercises) {

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
						add((IExc) Class.forName("Exercises." + s).newInstance());
					} catch (ClassNotFoundException e) {
						pl("Class not found.");
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}else{
				pl("\"files\" is null! Please add some class files for the launcher to work.");
				System.exit(0);
			}
		}else{
			pl("packageURL is null! Aborting!");
			System.exit(1);
		}
	}

	private void add(IExc exc) {
		Exercises.add(exc);
	}

	public void sort(ArrayList<IExc> list) {
		ArrayList<IExc> sortedList = new ArrayList<IExc>();
		for(IExc a: Exercises){

		}
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
