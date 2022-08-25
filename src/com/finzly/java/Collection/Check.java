package com.finzly.java.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Check {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Seeni", 1, 3));
		students.add(new Student("Hameed", 2, 22));
		students.add(new Student("Fahideen", 3, 11));
		students.add(new Student("Arjun", 4, 1));
		students.add(new Student("Revanth", 5, 2));
		students.add(new Student("Sampath", 5, 2));
		students.add(new Student("Gokul", 5, 2));

		Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		for (Student s : students) {
			System.out.println(s);
		}
	}

}