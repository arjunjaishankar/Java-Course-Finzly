package com.java.oops.inheritance;

public class Car extends Vehicle {

	public static void main(String[] args) {

		Car car = new Car();
		car.run();
		car.carRun();
	}

	public void carRun() {
		System.out.println("Car running");
	}

}
