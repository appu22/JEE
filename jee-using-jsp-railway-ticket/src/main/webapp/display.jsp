<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${nm} </h1>
	<%
	String name = request.getParameter("nm");
	String railwayNo = request.getParameter("railwayNo");
	String source = request.getParameter("source");
	String destination = request.getParameter("destination");
	String price = request.getParameter("price");

	request.setAttribute("nm", "Thank you " + name + " Have a  Happay journey..!");

	RequestDispatcher rq = request.getRequestDispatcher("railway_ticket.jsp");
	rq.forward(request, response);
	%>

</body>
</html>