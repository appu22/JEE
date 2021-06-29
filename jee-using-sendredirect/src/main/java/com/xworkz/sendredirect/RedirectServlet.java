package com.xworkz.sendredirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/name")
public class RedirectServlet extends HttpServlet {
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//down Casting--
		String name = (String) req.getAttribute("nm"); // it will return Object
		
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		resp.sendRedirect("https://www.google.com/");
	
	}

}
