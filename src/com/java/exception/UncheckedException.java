package com.java.exception;

public class UncheckedException {

	public static void main(String[] args) {
		try {
			String str = "adc";
			int i = Integer.parseInt(str);
			System.out.println("This method won't print in console..");
		} catch (NumberFormatException e) {
			System.out.println("Can not convert String to int");
			e.printStackTrace();
		}
	}
}
