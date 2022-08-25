package com.java.oops.abstraction;

public class EmployeeInfo implements Employee {

	public static void main(String[] args) {
		EmployeeInfo obj = new EmployeeInfo();
		obj.getName();
	}

	@Override
	public void getName() {
		System.out.println("Employee Name : Arjun jaishankar...");
	}

}
