<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="plam">

	<form action="display.jsp">
		<div>
			Passenger Name : <input type="text" name="nm"><br>
			<br> Railway No : <input type="text" name="railwayNo"><br>
			<br> Source : <input type="text" name="source"> To
			Destination : <input type="text" name="destination"><br>
			<br> Ticket Price : <input type="text" name="price"><br>
			<br>
			<input type="submit" value="submit">
		</div>
	</form>
</body>
</html>