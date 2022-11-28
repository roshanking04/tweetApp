package com.tweet.user.repositroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Hibconnection {

	public static Session getSession() {

		Configuration con = new AnnotationConfiguration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		return s;
	}
}
