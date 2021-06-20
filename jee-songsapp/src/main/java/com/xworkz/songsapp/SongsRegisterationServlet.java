package com.xworkz.songsapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.songsapp.dao.SongsDao;
import com.xworkz.songsapp.dao.SongsDaoImple;
import com.xworkz.songsapp.dto.SongsDto;

import lombok.NonNull;

@WebServlet(urlPatterns = "/songsform")
//initParams= {
//		@WebInitParam(name="Key", value="Gana"),
//}
public class SongsRegisterationServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Start Servlet ...........");
		String songsname = req.getParameter("songsname");
		String featuring = req.getParameter("featuring");
		String singer = req.getParameter("singer");
		String duration = req.getParameter("duration");
		String lang = req.getParameter("lang");
		String lyricist = req.getParameter("lyricist");

		SongsDto dto = new SongsDto();
		dto.setSongsName(songsname);
		dto.setFeaturing(featuring);
		dto.setSinger(singer);
		dto.setDuration(duration);
		dto.setLanguage(lang);
		dto.setLyricist(lyricist);

		SongsDao dao = new SongsDaoImple();
		dao.saveSongs(dto);
		List<SongsDto> allSongs = dao.getAllSongs();

		Iterator<SongsDto> iterator = allSongs.iterator();
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		writer.print("<html><body bgcolor=skyblue>" +"<h1 style=margin-left:auto; margin-right: auto;>Songs List</h1>"+ "<table border=2 width=50% height=50%"
				+ "style=margin-left:auto; margin-right: auto;>"
				+ "<th>Songsname</th>" 
				+ "<th>Featuring</th>" 
				+ "<th>Singer</th>" 
				+ "<th>Duration</th>"
				+ "<th>Language</th>" 
				+ "<th>Lyricisit</th></tr>");
		while (iterator.hasNext()) {
			SongsDto songsDto = (SongsDto) iterator.next();
			int id = songsDto.getId();
			String songsName2 = songsDto.getSongsName();
			String featuring2 = songsDto.getFeaturing();
			String singer2 = songsDto.getSinger();
			String duration2 = songsDto.getDuration();
			String language = songsDto.getLanguage();
			String lyricist2 = songsDto.getLyricist();
			writer.print("<tr><td>" + songsName2 + "</td>" + "<td>" + featuring2 + "</td>"
					+ "<td>" + singer2 + "</td>" + "<td>" + duration2 + "</td>" + "<td>" + language + "<td>" + lyricist2
					+ "</td></tr>");

		}
		writer.print("</table> </body>");
		writer.print(" <div style=margin-left:0; margin-right: auto;>CopyRight@appu2021</div> </br></html>");
		// writer.print(allSongs);
//		writer.print("text/html");
		writer.print(" Thank you for Selecting song " + songsname);
		System.out.println("Ended.......Servlet");

	}

}
