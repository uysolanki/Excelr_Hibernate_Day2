package com.excelr.ExclerHibernateWithMaven.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.ExclerHibernateWithMaven.entity.Stud;

public class HibernateMain {

	public static void main(String[] args) {
//		Configuration cfg=new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory=cfg.buildSessionFactory();

		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();  //commit DML queries


		
		
		session.close();
		factory.close();
		
	}

}
