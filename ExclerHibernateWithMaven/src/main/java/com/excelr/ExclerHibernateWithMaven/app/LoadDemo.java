package com.excelr.ExclerHibernateWithMaven.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.ExclerHibernateWithMaven.entity.Stud;
import com.excelr.ExclerHibernateWithMaven.util.MySessionFactory;

public class LoadDemo {
public static void main(String[] args) {
	SessionFactory factory=MySessionFactory.getSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Stud myStud=session.load(Stud.class, 1);
	System.out.println(myStud.getSname());
	tx.commit();
	
	System.out.println("Session Status after commit : " +session.isOpen());
	session.close();
	System.out.println("Session Status after close : " +session.isOpen());
	factory.close();
}
}
