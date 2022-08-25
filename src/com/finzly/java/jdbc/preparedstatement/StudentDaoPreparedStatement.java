package com.finzly.java.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.finzly.java.jdbc.ConnectionProvider;
import com.finzly.java.jdbc.model.Student;

public class StudentDaoPreparedStatement {

	private Connection con;
	private String query;
	private PreparedStatement ps;

	public StudentDaoPreparedStatement() throws SQLException {
		con = ConnectionProvider.getConnection();
	}

	// Add student data
	public String createStundent(Student stu) throws SQLException {
		query = "insert into student(id,name,department) values (?,?,?)";
		ps = con.prepareStatement(query);
		ps.setInt(1, stu.getId());
		ps.setString(2, stu.getName());
		ps.setString(3, stu.getDepartment());
		return ps.executeUpdate() + " Student data inserted.";
	}

	// delete student data
	public String deleteStundent(int id) throws SQLException {
		query = "delete from student where id = ?";
		ps = con.prepareStatement(query);
		ps.setInt(1, id);
		return ps.executeUpdate() + " Student data deleted.";
	}

	// update student data
	public String updateStudent(Student stu) throws SQLException {
		query = "update student set name = ?, department = ? where id = ?";
		ps = con.prepareStatement(query);
		ps.setString(1, stu.getName());
		ps.setString(2, stu.getDepartment());
		ps.setInt(3, stu.getId());
		return ps.executeUpdate() + " Student data deleted";
	}

	// get single student data
	public Student getStudent(int id) throws SQLException {
		query = "select * from student where id = ?";
		ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Student stu = new Student();
		if (rs != null) {
			while (rs.next()) {
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setDepartment(rs.getString("department"));
			}
			return stu;
		}
		return null;
	}

	// get all student data.
	public ArrayList<Student> getAllStudent() throws SQLException {
		query = "select * from student";
		ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		ArrayList<Student> students = new ArrayList<>();
		if (rs != null) {
			while (rs.next()) {
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setDepartment(rs.getString("department"));
				students.add(stu);
			}
			return students;
		}
		return null;
	}

}
