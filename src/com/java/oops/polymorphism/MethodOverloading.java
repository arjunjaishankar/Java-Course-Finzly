package com.java.oops.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println("passing int as argument : " + obj.add(2, 3));
		System.out.println("passing double as argument : " + obj.add(2.3, 2.4));

	}

	private double add(double a, double b) {
		return a + b;
	}

	private int add(int a, int b) {
		return a + b;
	}
}
