package com.finzly.java.jdbc.preparedstatement;

import java.sql.SQLException;
import java.util.ArrayList;

import com.finzly.java.jdbc.model.Student;

public class PreparedStatementTest {

	private static StudentDaoPreparedStatement statement;

	public PreparedStatementTest() throws SQLException {
		statement = new StudentDaoPreparedStatement();
	}

	public void createStudent() throws SQLException {
		statement.createStundent(new Student(1821003, "Arjun", "Computer science"));
		statement.createStundent(new Student(1821004, "Sampath", "Mechanical"));
		statement.createStundent(new Student(1821005, "Aravindh", "Civil"));
		statement.createStundent(new Student(1821006, "Gokul", "Electronic"));
		getAllStudent();

	}

	public static void getAllStudent() throws SQLException {
		ArrayList<Student> students = statement.getAllStudent();
		for (Student s : students)
			System.out.println(s);
	}

	public void getStudent(int id) throws SQLException {
		Student st = statement.getStudent(id);
		System.out.println(st);

	}

	public void updateStudent() throws SQLException {
		Student s = statement.getStudent(1821004);
		s.setDepartment("Diplamo");
		statement.updateStudent(s);
		getAllStudent();
	}

	public void deleteStudent(int id) throws SQLException {
		statement.deleteStundent(id);
		getAllStudent();
	}

}
