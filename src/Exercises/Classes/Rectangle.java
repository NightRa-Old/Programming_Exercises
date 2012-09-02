// Created by Ilan Godik

package Exercises.Classes;

public class Rectangle
{

	private double width;
	private double height;

	public Rectangle()
	{
		this.width = 1;
		this.height = 1;
	}

	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	public double getWidth()
	{
		return width;
	}

	public double getHeight()
	{
		return height;
	}

	public double getArea()
	{
		return width * height;
	}

	public double getPerimeter()
	{
		return (width + height) * 2;
	}
}
