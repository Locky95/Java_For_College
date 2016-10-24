package com.daryn.Lab1;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		
		double radius = 3;
		circle.findArea(radius);
		circle.findPerimeter(radius);
		
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());

	}

}
