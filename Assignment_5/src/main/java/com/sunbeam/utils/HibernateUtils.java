package com.sunbeam.utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionFactory;
	
	static {
		System.out.println("Hey There!!");
		sessionFactory = new Configuration()
			.configure()
			.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
