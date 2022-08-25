package com.finzly.java.jdbc.statement;

import java.sql.SQLException;
import java.util.ArrayList;

import com.finzly.java.jdbc.model.Student;

public class StatementTest {

	private static StudentDaoStatement statement;

	public StatementTest() throws SQLException {
		statement = new StudentDaoStatement();
	}

	public void createStuStatement() throws SQLException {
		statement.createStundent(new Student(1821003, "Arjun", "Computer science"));
		statement.createStundent(new Student(1821004, "Sampath", "Mechanical"));
		statement.createStundent(new Student(1821005, "Aravindh", "Civil"));
		statement.createStundent(new Student(1821006, "Gokul", "Electronic"));
		getAllStuStatement();

	}

	public static void getAllStuStatement() throws SQLException {
		ArrayList<Student> students = statement.getAllStudent();
		for (Student s : students)
			System.out.println(s);
	}

	public void getStuStatement(int id) throws SQLException {
		Student st = statement.getStudent(id);
		System.out.println(st);

	}

	public void updateStuStatement() throws SQLException {
		Student s = statement.getStudent(1821004);
		s.setDepartment("Diplamo");
		statement.updateStudent(s);
		getAllStuStatement();
	}

	public void deleteStuStatement(int id) throws SQLException {
		statement.deleteStundent(id);
		getAllStuStatement();
	}
}
