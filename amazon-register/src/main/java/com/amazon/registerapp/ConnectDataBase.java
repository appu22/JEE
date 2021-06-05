package com.amazon.registerapp;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectDataBase {

	
	public void dbConnect() throws PersistenceException {


		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			
			
		}catch(Exception exception) {
			
		}
	}
	
	
}
