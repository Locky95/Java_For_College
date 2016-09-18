package com.daryn.Lab1;

public class Car {
	
	double cEff, fuel, distance,fuelUsed;
	public Car()
	{
		cEff = 0;
		fuel = 0;
	}
	public Car(double cEff)
	{
		setCarEfficiency(cEff);
	}
	public void setCarEfficiency(double cEff)
	{
		this.cEff = cEff;
	}
	public void setFuel(double fuel)
	{
		this.fuel = fuel;
	}
	public double getCEff()
	{
		return cEff;
	}
	public double getFuel ()
	{
		return fuel;
	}
	public void addFuel(double addFuel)
	{
		fuel = fuel + addFuel;
	}
	
	public double drive()
	{
		fuelUsed = distance/cEff;
		fuel= fuel-fuelUsed;
		return fuel;
	}
	
}
