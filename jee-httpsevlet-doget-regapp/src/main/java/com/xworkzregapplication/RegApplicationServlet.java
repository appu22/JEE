package com.xworkzregapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/rs")
public class RegApplicationServlet extends HttpServlet {

	public RegApplicationServlet() {
		System.out.println(getClass().getSimpleName() + " Object Created........");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("invoking doGet Method");

		String userName = req.getParameter("un");
		String lastName = req.getParameter("ln");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");

		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.print("Thank you for regsiration ...!" + userName);
	}

}
