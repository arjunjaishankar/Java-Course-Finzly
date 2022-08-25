package com.java.oops.encapsulation;

public class StudentInfo {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Arjun jaishankar");
		st.setRegisterNumber(1821003);
		System.out.println("Student name : " + st.getName());
		System.out.println("Student register number :" + st.getRegisterNumber());
	}

}
