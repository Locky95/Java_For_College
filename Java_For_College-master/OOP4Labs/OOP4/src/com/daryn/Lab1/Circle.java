package com.daryn.Lab1;

public class Circle {

	double radius;
	double area;
	double perimeter;
	public Circle()
	{
		radius = 0;
	}
	
	public Circle(double radius)
	{
		setRadius(radius);
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void findArea(double radius)
	{
		area = Math.PI * radius;
	}
	public double getArea()
	{
		return area;
	}
	public void findPerimeter(double radius)
	{
		perimeter = 2 * Math.PI * radius;
	}
	public double getPerimeter()
	{
		return perimeter;
	}
	public String toString()
	{
		return String.format("Area : %f \nPerimeter : %f", getArea(),getPerimeter());
	}
}
