package com.xworkz.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

////servlet object will be created two types one is application load time , and client make request
//when clint make request servlet object will be created...
@WebServlet("/reg")
public class RegistrationServlet extends GenericServlet {

	public RegistrationServlet() {
		System.out.println(getClass().getSimpleName() + " Object Created ...");
	}
	
	
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String password = req.getParameter("pwd");

		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");

		ServletContext context = getServletContext();
		String value = context.getInitParameter("message");
		
		writer.print("Welcome To Your Page " + name);
		writer.print(" -->  " + value);

	}

}
