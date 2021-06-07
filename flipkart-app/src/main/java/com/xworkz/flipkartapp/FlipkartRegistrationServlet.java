package com.xworkz.flipkartapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.xworkz.flipkartapp.dto.FlipkartappRegisterDTO;
import com.xworkz.flipkartapp.service.FlipkartRegisterService;
import com.xworkz.flipkartapp.service.FlipkartRegisterServiceImple;

@WebServlet("/rs")
public class FlipkartRegistrationServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
System.out.println("service started......");
		String name = req.getParameter("nm");
		String lastname = req.getParameter("ln");
		String mobileno = req.getParameter("mobileno");
		String email = req.getParameter("email");

		PrintWriter writer = res.getWriter();
		writer.print("text/html");
		writer.print("Thank you...."+name);
		
		
		FlipkartappRegisterDTO dto = new FlipkartappRegisterDTO();
		
		dto.setName(name);
		dto.setLastName(lastname);
		dto.setMobileNo(mobileno);
		dto.setEmailId(email);
		
		FlipkartRegisterService flipkartRegisterService = new FlipkartRegisterServiceImple();
		
		flipkartRegisterService.validateAndSave(dto);
		System.out.println("service closed......");
	}

}
