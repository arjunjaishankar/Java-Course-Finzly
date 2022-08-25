package com.finzly.java.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class ConditionalRetrive {

	public void getStudentById(Criteria cr) {
		List<Student> students = cr.add(Restrictions.in("id", 1821003)).list();
		displayStudent(students);
	}

	public void getStudentByName(Criteria cr) {
		List<Student> students = cr.add(Restrictions.like("name", "Ram")).list();
		displayStudent(students);
	}

	public void getStudentGtId(Criteria cr) {
		List<Student> students = cr.add(Restrictions.gt("id", 1821003)).list();
		displayStudent(students);
	}

	public void getStudentLtId(Criteria cr) {
		List<Student> students = cr.add(Restrictions.lt("id", 1821005)).list();
		displayStudent(students);
	}

	public void getStudentLTEId(Criteria cr) {
		List<Student> students = cr.add(Restrictions.le("id", 1821005)).list();
		displayStudent(students);
	}

	private static void displayStudent(List<Student> students) {
		for (Student st : students)
			System.out.println(st);
	}
}
