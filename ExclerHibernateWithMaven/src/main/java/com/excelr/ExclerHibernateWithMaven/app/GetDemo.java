package com.excelr.ExclerHibernateWithMaven.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.ExclerHibernateWithMaven.entity.Stud;
import com.excelr.ExclerHibernateWithMaven.util.MySessionFactory;

public class GetDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	System.out.println("First Request for Alice's Record");
    	Stud mystudent=session.get(Stud.class, 1);
    	System.out.println(mystudent);
    	
    	System.out.println("First Request for Ben's Record");
    	Stud mystudent1=session.get(Stud.class, 1);
    	System.out.println(mystudent1);
    	
    	System.out.println(mystudent==mystudent1);
    	
    	session.close();
    	factory.close();
	}

}
