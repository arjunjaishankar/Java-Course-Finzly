package com.java.oops.composition;

public class Composition {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Arjun");
		emp.getAddress().setStreet("A.C Nagar");
		emp.getAddress().setState("Tamil Nadu");
		emp.getAddress().setCountry("India");

		System.out.println(emp);
		System.out.println(emp.getAddress());
		emp = null;
		System.out.println(emp);
		System.out.println((emp == null) ? " Address doesn't exist " : emp.getAddress());

	}
}
