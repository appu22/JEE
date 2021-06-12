package com.xworkz.instaregisterapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.instaregisterapp.dto.InstaRegisterDTO;

public class InstaRegisterDAOImple implements InstaRegisterDAO {

	@Override
	public void save(InstaRegisterDTO dto) throws SQLException {

		System.out.println("save method invoking InstaRegisterDAOImple ");
		
		//******** jdbc *******************
		
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			e.printStackTrace();
//		}
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee", "root", "root");
//		PreparedStatement prepareStatement = connection
//				.prepareStatement("insert into insta_register_table values(?,?,?,?,?)");
//
//		prepareStatement.setInt(1, 1);
//		prepareStatement.setString(2, dto.getName());
//		prepareStatement.setString(3, dto.getLastname());
//		prepareStatement.setString(4, dto.getMobileNo());
//		prepareStatement.setString(5, dto.getGender());
//		
//		prepareStatement.executeUpdate();
		
		//*************   hibernate   ****************	

		SessionFactory sessionFactory = null;
		Session session = null;
		try {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("------configuration--------------");
		sessionFactory = configuration.buildSessionFactory();
		System.out.println("------sessionFactory--------------");
		 session = sessionFactory.openSession();
		System.out.println("------session--------------");
		Transaction transaction = session.beginTransaction();
		session.save(dto);
//			session.persist(dto);
		transaction.commit();
		} catch (Exception e) {
			session.getTransaction().commit();
			e.printStackTrace();

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed.");
			} else {
				System.out.println("Session not closed.......");
			}
			if (sessionFactory != null) {
				System.out.println("Session Fcatory closed........");
				sessionFactory.close();
			} else {
				System.out.println("Session factory not  closed,..... ....");
			}
		}

	}

}
