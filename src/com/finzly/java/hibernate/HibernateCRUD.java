package com.finzly.java.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCRUD {

	public static void main(String[] args) {

		StudentCRUD obj = new StudentCRUD();
		Configuration config = new Configuration().configure();

		config.addAnnotatedClass(Student.class);

		SessionFactory sf = config.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		// add student data
		/*
		 * obj.createStudent(session);
		 * 
		 * // retrive all student obj.getAllStudent(session);
		 * 
		 * // update student data obj.updateStudent(session);
		 * 
		 * // delete student data obj.deleteStudent(session);
		 */

		ConditionalRetrive conret = new ConditionalRetrive();
		Criteria cr = session.createCriteria(Student.class);

		conret.getStudentById(cr);
		conret.getStudentByName(cr);
		conret.getStudentGtId(cr);
		conret.getStudentLtId(cr);
		conret.getStudentLTEId(cr);
		tr.commit();
		session.close();
		sf.close();

	}

}
