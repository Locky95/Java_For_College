package com.daryn.Lab1;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(30);// 30 miles per gallon
		myCar.addFuel(20);
		myCar.distance = 90;
		myCar.drive();
		System.out.print(myCar.getFuel());
	}

}
