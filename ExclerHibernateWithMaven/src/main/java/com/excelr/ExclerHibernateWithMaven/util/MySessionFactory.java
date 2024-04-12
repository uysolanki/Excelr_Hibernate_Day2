package com.excelr.ExclerHibernateWithMaven.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {
	static SessionFactory factory;
	public static SessionFactory getSessionFactory()
	{
		factory=new Configuration().configure().buildSessionFactory();
		return factory;
	}
}
