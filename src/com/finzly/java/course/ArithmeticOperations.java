package com.finzly.java.course;

public class ArithmeticOperations {

	public static void main(String[] args) {

		ArithmeticOperations obj = new ArithmeticOperations();
		System.out.println("Addition : " + obj.addition(4, 5));
		System.out.println("Subtraction : " + obj.subtraction(5, 4));
		System.out.println("Multiplication : " + obj.multiplication(4, 5));
		System.out.println("Divison : " + obj.divison(10, 2));
		System.out.println("Average : " + obj.avg(5, 5));
		System.out.println("Modulo : " + obj.modulo(10, 2));
		System.out.println("Square : " + obj.square(4));
		System.out.println("cube : " + obj.cube(3));
		System.out.println("Square Root : " + obj.squareRoot(64));
		System.out.println("Cube Root :" + obj.cubeRoot(27));

	}

	private int cubeRoot(int i) {
		return (int) Math.sqrt(i);
	}

	private int squareRoot(int i) {
		return (int) Math.cbrt(i);
	}

	private int addition(int i, int j) {
		return (i + j);
	}

	private int subtraction(int i, int j) {
		return (i - j);
	}

	private int multiplication(int i, int j) {
		return (i * j);
	}

	private int divison(int i, int j) {
		return (i / j);
	}

	private int modulo(int i, int j) {
		return (i % j);
	}

	private int avg(int i, int j) {
		return (i + j) / 2;
	}

	private int square(int i) {
		return (i * i);
	}

	private int cube(int i) {
		return (i * i * i);
	}
}
