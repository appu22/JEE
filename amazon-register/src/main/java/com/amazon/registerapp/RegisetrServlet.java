package com.amazon.registerapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.imageio.spi.RegisterableService;
import javax.imageio.spi.ServiceRegistry;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amazon.registerapp.dbconstants.DBConstants;
import com.amazon.registerapp.dto.RegisterDTO;
import com.amazon.registerapp.service.RegisterService;
import com.amazon.registerapp.service.RegisterServiceImple;

//add jar file servlet.jar form apache lib folder 
@WebServlet("/register")
public class RegisetrServlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// jsp page mapping [key and value pair]
		String name = req.getParameter("nm");

		String mobileNo = req.getParameter("mobileno");

		String email = req.getParameter("email");

		String password = req.getParameter("pwd");

		PrintWriter write = res.getWriter();
		write.print("text/html");// print in browser
		write.print(" Thanky for register Mr/Ms : " + name);

		RegisterDTO dto = new RegisterDTO();
		dto.setName(name);
		dto.setMobileNo(mobileNo);
		dto.setEmail(email);
		dto.setPassword(password);
		
		RegisterService serviceImple = new RegisterServiceImple();
		serviceImple.validateAndSave(dto);
		

//		try {
//			Class.forName(DBConstants.DRIVER);
//			Connection connection = DriverManager.getConnection(DBConstants.URL,DBConstants.USERNAME,DBConstants.PASSWORD);
//
//			PreparedStatement statement = connection.prepareStatement("insert into register_table values (?,?,?,?,?)");
//			statement.setInt(1, 3);
//			statement.setString(2, name);
//			statement.setString(3, mobileNo);
//			statement.setString(4, email);
//			statement.setString(5, password);
//			int i = statement.executeUpdate();
//
//			statement.close();
//			connection.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}

	}

}
