package com.xworkz.songsapp.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.songsapp.dto.SongsDto;

public class SongsDaoImple implements SongsDao {
	@Override
	public void saveSongs(SongsDto dto) {
		System.out.println("Save Songs Method invoked..");
		Session openSession = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			openSession = sessionFactory.openSession();
			openSession.getTransaction().begin();
			openSession.save(dto);
			openSession.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			openSession.getTransaction().rollback();

		} finally {
			if (openSession != null) {
				System.out.println("Open Session Closed...");
				openSession.close();
			} else {
				System.out.println("Open Session not Close...");
			}
			if (sessionFactory != null) {
				System.out.println("Session factory closed..");
				sessionFactory.close();
			} else {
				System.out.println("Session Factory not closed....");
			}
		}
	}

	@Override
	public List<SongsDto> getAllSongs(){
		System.out.println("Get all songs list ");
		SessionFactory sessionFactory = null;
		Session openSession = null;

		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			openSession = sessionFactory.openSession();
//			String getAllRecodrs = " FROM songs_table";
//			SongsDto songsDto = openSession.get(SongsDto.class, 1);
//			System.out.println("songsDto : "+songsDto);
			Query query = openSession.createNamedQuery("getAllRecord");
			List<SongsDto> list = query.list();
			for (SongsDto dto : list) {
				System.out.println(dto);
//				list.add(dto);
			}
			return list;			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (openSession != null) {
				System.out.println("Open Session Closed...");
				openSession.close();
			} else {
				System.out.println("Open Session not Close...");
			}
			if (sessionFactory != null) {
				System.out.println("Session factory closed..");
				sessionFactory.close();
			} else {
				System.out.println("Session Factory not closed....");
			}
		}
		return null;
	}

}
