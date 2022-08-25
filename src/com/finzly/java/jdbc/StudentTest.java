package com.finzly.java.jdbc;

import java.sql.SQLException;

import com.finzly.java.jdbc.preparedstatement.PreparedStatementTest;
import com.finzly.java.jdbc.statement.StatementTest;

public class StudentTest {

	public static void main(String[] args) throws SQLException {

		StatementTest st = new StatementTest();
		PreparedStatementTest ps = new PreparedStatementTest();
		// <--Adding student data -->
		// st.createStuStatement();
		// ps.createStudent();

		// <--read single student data-->
		// st.getStuStatement();
		// ps.getStudent(1821003);

		// <--read all student data-->
		// st.getAllStuStatement();
		// ps.getAllStudent();

		// <--update student data-->
		// st.updateStuStatement();
		// ps.updateStudent();

		// <--delete student-->
		// st.deleteStuStatement();
		// ps.deleteStudent(1821006);

	}
}
