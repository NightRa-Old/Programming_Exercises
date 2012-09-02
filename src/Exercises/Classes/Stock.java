// Created by Ilan Godik

package Exercises.Classes;

public class Stock
{
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public Stock(String symbol, String name)
	{
		this.symbol = symbol;
		this.name = name;
	}

	public double getChangePercent()
	{
		return (previousClosingPrice / currentPrice) * 100;
	}

	public double getPreviousClosingPrice()
	{
		return previousClosingPrice;
	}

	public double getCurrentPrice()
	{
		return currentPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice)
	{
		this.previousClosingPrice = previousClosingPrice;
	}

	public void setCurrentPrice(double currentPrice)
	{
		this.currentPrice = currentPrice;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public String getName()
	{
		return name;
	}
}
