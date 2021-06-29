package com.xworkz.regapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

////servlet object will be created two types one is application load time , and client make request
//loadOnStartup -- as soon as application loaded servlet object will be created..

//@WebServlet(urlPatterns = "/regapp",loadOnStartup = 22, initParams = { 
//		@WebInitParam(name = "key", value = "name")
//		})

public class RegAppServlet extends GenericServlet {

	public RegAppServlet() {

		System.out.println(getClass().getSimpleName() + "Object Created ...");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("invoking Service Method");

		String name = req.getParameter("un");

		String password = req.getParameter("pwd");

		String email = req.getParameter("email");

		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		writer.print("SuccessFully Regsiterd ....! " + name);

	}

}
