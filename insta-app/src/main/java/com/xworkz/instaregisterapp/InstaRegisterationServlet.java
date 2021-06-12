package com.xworkz.instaregisterapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.xworkz.instaregisterapp.dao.InstaRegisterDAOImple;
import com.xworkz.instaregisterapp.dto.InstaRegisterDTO;
import com.xworkz.instaregisterapp.dao.InstaRegisterDAO;

@WebServlet(urlPatterns = "/rs")
public class InstaRegisterationServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("nm");
		String lastname = req.getParameter("ln");
		String mobileno = req.getParameter("mn");
		String gender = req.getParameter("gen");

		PrintWriter writer = res.getWriter();
		writer.print("text/html");
		writer.print("Thank you -- " + name);

		InstaRegisterDTO dto = new InstaRegisterDTO();
		dto.setName(name);
		dto.setLastname(lastname);
		dto.setMobileNo(mobileno);
		dto.setGender(gender);

		InstaRegisterDAO dao = new InstaRegisterDAOImple();
		try {
			dao.save(dto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
