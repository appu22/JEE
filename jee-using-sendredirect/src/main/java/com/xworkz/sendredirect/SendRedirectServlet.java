package com.xworkz.sendredirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/search")
public class SendRedirectServlet extends HttpServlet {

	public SendRedirectServlet() {
		System.out.println("Object Created...." + getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("nm");

//		req.setAttribute("nm", name);
//		String password = req.getParameter("pwd");
//		req.setAttribute("name", name);
//		req.setAttribute("psswd", password);

//		RequestDispatcher dispatcher = req.getRequestDispatcher("name");
		resp.sendRedirect("https://www.google.co.in/search?q=" + name);
//		dispatcher.forward(req, resp);
//		dispatcher.include(req, resp);
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.print("name == "+name);
	}

}
