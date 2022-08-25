package com.java.oops.aggregation;

public class Aggregation {

	public static void main(String[] args) {

		Address address1 = new Address("A.C Nagar", "Tamil Nadu", "India");
		Address address2 = new Address("Subash Street", "Kerala", "India");
		Employee employee1 = new Employee("Arjun", address1);
		Employee employee2 = new Employee("Fahideen", address2);
		System.out.println(employee1);
		System.out.println(address1);
		employee1 = null;
		System.out.println(employee1);
		System.out.println(address1);

	}
}
