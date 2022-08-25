package com.finzly.java.hibernate;

import java.util.List;

import org.hibernate.Session;

public class StudentCRUD {

	public void createStudent(Session session) {
		Student stu = new Student();
		stu.setId(1821003);
		stu.setName("Arjun");
		stu.setDepartment("Computer science");
		session.save(stu);
	}

	public void getAllStudent(Session session) {

		List<Student> students = session.createQuery("from Student").list();
		System.out.println(students);

	}

	public void updateStudent(Session session) {

		Student st = session.load(Student.class, 1821005);
		st.setName("Ram");
		st.setDepartment("EEE");
		session.update(st);
	}

	public void deleteStudent(Session session) {

		Student s = session.load(Student.class, 1821004);
		session.delete(s);
	}
}
