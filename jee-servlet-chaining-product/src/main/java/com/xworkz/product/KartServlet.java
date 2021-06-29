package com.xworkz.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kart")
public class KartServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String pn = req.getParameter("pname");

		String qty = req.getParameter("pQty");

		String pc = req.getParameter("price");

		double cal = Double.parseDouble(pc) * Integer.parseInt(qty);

//		double total = cal * parseInt;

		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.print("product your price will be  UserName: "+ pn +"</br>  Quntity : "+ qty+"</br>  Price : "+pc);
		writer.print("</br>  product your price will be  : "+" Total Price : "+cal);

	}
}
