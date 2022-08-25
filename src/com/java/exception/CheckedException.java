package com.java.exception;

public class CheckedException {

	public static void main(String[] args) {

		try {
			Class ghost = Class.forName("Ghost");
		} catch (ClassNotFoundException e) {
			System.out.println("Class doesn't exist..");
			e.printStackTrace();
		}
	}
}
