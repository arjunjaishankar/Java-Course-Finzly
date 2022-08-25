package com.java.oops.polymorphism;

public class MethodOverridingImpl extends MethodOverriding {

	public static void main(String[] args) {

		MethodOverriding obj = new MethodOverridingImpl();
		obj.walk();
	}

	@Override
	public void walk() {
		System.out.println("Inside walking method in Child class");
	}
}
