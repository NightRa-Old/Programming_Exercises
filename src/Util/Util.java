// Created by Ilan Godik

package Util;

import java.util.Scanner;

public class Util
{
	public static Scanner in = new Scanner(System.in);
	public static boolean debugMode = true;

	public static void pl(String s)
	{
		System.out.println(s);
	}

	public static void p(String s)
	{
		System.out.print(s);
	}

	public static double shortenDouble(double d, int afterPoint)
	{
		return (int) (d * Math.pow(10, afterPoint)) / Math.pow(10, afterPoint);
	}
}
