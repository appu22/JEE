package com.xworkz.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/product", loadOnStartup = 16)
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println(getClass().getSimpleName() + "  object created ");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productName = req.getParameter("pname");
		String qty = req.getParameter("pQty");
		String price = req.getParameter("price");

		/*
		 * scopes are throught the application there three types of Scopes in servlet
		 * --req , context , session req--form data or ui context-- session its stores
		 * ui data with DB
		 */

		
		
		
		Cookie cookie = new  Cookie("appucookie", productName);
		
		cookie.setMaxAge(5000);
		
		resp.addCookie(cookie);
		
		
//		Adding to the req scope 
		req.setAttribute("pname", productName);
		req.setAttribute("pQty", qty);
		req.setAttribute("price", price);

//		servlet chaining
		RequestDispatcher dispatcher = req.getRequestDispatcher("kart");
		dispatcher.forward(req, resp);
		dispatcher.include(req, resp);

//		resp.sendRedirect("");

	}
}
