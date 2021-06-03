package com.xworkz.registerapp.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/rs")
public class RegsterServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("nm");
		String address = req.getParameter("address");
		String age = req.getParameter("age");
		String email = req.getParameter("email");

		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");

		writer.print("Thank you !! " + name);

	}

}
