package com.amazon.registerapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

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
	}
}
