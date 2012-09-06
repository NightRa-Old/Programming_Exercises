// Created by Ilan Godik

package Exercises.Classes;

public class RegularPolygon {
	private int n = 3;
	private double size = 1;
	private double x = 0;
	private double y = 0;

	public RegularPolygon() {
	}

	public RegularPolygon(int n, double size) {
		this.n = n;
		this.size = size;
	}

	public RegularPolygon(int n, double size, double x, double y) {
		this.n = n;
		this.size = size;
		this.x = x;
		this.y = y;
	}

	public double getPerimeter() {
		return getSize() * getN();
	}

	public double getArea() {
		return (getN() * getSize() * getSize()) / (4 * Math.tan(Math.PI / getN()));
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
